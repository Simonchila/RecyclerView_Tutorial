 📘 RecyclerView Notes (Android, Java)

 🔹 What is RecyclerView?

* A **flexible, efficient, modern** replacement for `ListView`/`GridView`.
* Displays large datasets by **recycling views** (reuses off-screen views instead of creating new ones).

---
🔹 Core Components

1. **RecyclerView** → The container (in XML).
2. **Adapter** → Bridges data with the RecyclerView.

   * Creates item views (`onCreateViewHolder`).
   * Binds data to item views (`onBindViewHolder`).
   * Tells how many items exist (`getItemCount`).
3. **ViewHolder** → Caches references to UI elements inside an item.

   * Prevents repeated `findViewById` calls → smoother scrolling.
4. **LayoutManager** → Controls item arrangement.

   * `LinearLayoutManager` → vertical/horizontal list.
   * `GridLayoutManager` → grid layout.
   * `StaggeredGridLayoutManager` → Pinterest-style.

---

## 🔹 Typical Flow

1. Add `RecyclerView` in `activity_main.xml`.
2. Create item layout (`item_row.xml`).
3. Make `Adapter` + `ViewHolder`.
4. In `Activity/Fragment`:

   * Setup `LayoutManager`.
   * Attach Adapter to RecyclerView.

---

🔹 Example Snippets

**XML**

```xml
<androidx.recyclerview.widget.RecyclerView
    android:id="@+id/recyclerView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>
```

**Adapter**

```java
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<String> items;

    public MyAdapter(List<String> items) { this.items = items; }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.itemText);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(items.get(position));
    }

    @Override
    public int getItemCount() { return items.size(); }
}
```

**Activity**

```java
recyclerView.setLayoutManager(new LinearLayoutManager(this));
recyclerView.setAdapter(new MyAdapter(dataList));
```

---

## 🔹 Common Enhancements

* Item **click listeners** (`onClick` inside ViewHolder).
* **Custom layouts** (images, buttons, etc. in item XML).
* **DiffUtil** for efficient updates.
* **ItemDecoration** for dividers/margins.
* Use **ViewBinding / DataBinding** instead of `findViewById`.

---

## 🔹 Key Takeaway

* **ViewHolder = performance boost (caches views).**
* **Adapter = data binder (connects dataset → views).**
* **LayoutManager = decides item arrangement.**

---

👉 Quick mental model:

```
Dataset → Adapter → ViewHolder → RecyclerView (on screen)
```

---
