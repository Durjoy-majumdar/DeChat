package com.tencent.p014mm.p136ui.chatting.component;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.component.i2 */
public class C73496i2 extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ GroupTodoComponent f215922d;

    public C73496i2(GroupTodoComponent groupTodoComponent) {
        this.f215922d = groupTodoComponent;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/GroupTodoComponent$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        Log.m105919d("MicroMsg.roomTodo.GroupTodoComponent", "onScrollStateChanged newState:%s canScrollHorizontally(-1):%s", Integer.valueOf(i), Boolean.valueOf(recyclerView.canScrollHorizontally(-1)));
        if (i != 0 || recyclerView.canScrollHorizontally(-1)) {
            this.f215922d.f215550h.setVisibility(0);
            this.f215922d.f215549g.setVisibility(0);
        } else {
            this.f215922d.f215550h.setVisibility(8);
            this.f215922d.f215549g.setVisibility(8);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/GroupTodoComponent$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
