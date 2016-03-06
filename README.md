StickyGridHeaders [android]
========

Usage
--------
Add StickyGridHeadersGridView to your layout:
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">


    <com.onecode.stickyheadergrid.tonicartos.StickyGridHeadersGridView
        android:id="@+id/asset_grid"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:verticalSpacing="8dp"
        android:horizontalSpacing="8dp"/>

</LinearLayout>
```

Make your adapter extends StickyGridAdapter:

```java
public class ExampleAdapter extends StickyGridAdapter<ExampleModel, ExampleAdapter.ViewHolder, ExampleAdapter.HeaderViewHolder> {

    public ExampleAdapter(Context context) {
        super(context);
    }

    @Override
    protected int headerLayout() {
        return R.layout.adapter_example_header;
    }

    @Override
    protected HeaderViewHolder headerViewHolder(View root) {
        return new HeaderViewHolder(root);
    }

    @Override
    protected void populateHeader(ExampleModel data, HeaderViewHolder headerViewHolder) {
        // populate header viewholder
    }

    @Override
    public long getHeaderId(int position) {
        // return a value that indicates to which header getItem(position) belongs
    }

    @Override
    protected int layout() {
        return R.layout.adapter_example;
    }

    @Override
    protected ViewHolder viewHolder(View root) {
        return new ViewHolder(root);
    }

    @Override
    protected void populate(ExampleModel data, ViewHolder viewHolder) {
        // populate viewholder
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder extends BaseViewHolder {

        //Views

        public ViewHolder(View root) {
            super(root);
            //Binding
        }
    }

    public static class HeaderViewHolder extends BaseViewHolder {

        //Views

        public HeaderViewHolder(View root) {
            super(root);
            //Binding
        }
    }
}

```

Download
--------
Add the JitPack repository to your root build.gradle:

```groovy
	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```
Add the Gradle dependency:
```groovy
	dependencies {
		compile 'com.github.goodengineer:StickyGridHeaders:1.0.2@aar'
	}
```

Example
--------
![example_grid](https://cloud.githubusercontent.com/assets/4495145/13553253/d16286f0-e361-11e5-89ef-3ae095b8fdb1.gif)

The example source code is included in this repository.

License
--------
```
Copyright 2013 Tonic Artos

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
