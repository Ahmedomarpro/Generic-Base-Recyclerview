# Generic-Base-Recyclerview

## RecyclerView adapter classes for managing multiple view types

 
 Project RecyclerView 
[GitHub](https://github.com/Ahmedomarpro/Generic-Base-Recyclerview/tree/master/app/src/main)

![Screenshot (7)](https://user-images.githubusercontent.com/22521791/66183340-e42b0780-e678-11e9-8b50-ca426585cfbf.png)

![]

![Screenshot (8)](https://user-images.githubusercontent.com/22521791/66183354-f1e08d00-e678-11e9-805a-6bdd59ecc536.png)



 
# Usage 

### 1. Create DataBinder

Define class extending DataBinder for each view type.
DataBinder class is used to bind view and data.

Please refer the binder adapter base for usage.

### 2. Create DataBindAdapter

Create adapter class to manage DataBinder classes.
Use (or extend) ListBindAdapter (or one_base_Adapter) if the order of view types used for recyclerview is in sequence. If the order of view types is complex, create class by extending one_base_Adapter or .tow_base_Adapter.

Please refer the adapter  for usage.
### 3. Set adapter for recyclerview
