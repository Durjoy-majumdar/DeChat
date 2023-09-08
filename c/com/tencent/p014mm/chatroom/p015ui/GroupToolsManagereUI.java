package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.storage.GroupToolItem;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kr0.C76629w0;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import p203mi.C21505e0;
import p644pi.C77089d;
import p684si.C36674e;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI */
public class GroupToolsManagereUI extends MMActivity implements C11385n {

    /* renamed from: v */
    public static final /* synthetic */ int f48703v = 0;

    /* renamed from: d */
    public LinearLayout f48704d;

    /* renamed from: e */
    public RecyclerView f48705e;

    /* renamed from: f */
    public LinearLayout f48706f;

    /* renamed from: g */
    public RecyclerView f48707g;

    /* renamed from: h */
    public C89779i0 f48708h = null;

    /* renamed from: i */
    public C17703j f48709i;

    /* renamed from: j */
    public C16665p f48710j;

    /* renamed from: n */
    public C1179k f48711n;

    /* renamed from: o */
    public C17703j f48712o;

    /* renamed from: p */
    public C36674e f48713p = null;

    /* renamed from: q */
    public LinkedList<GroupToolItem> f48714q = new LinkedList<>();

    /* renamed from: r */
    public String f48715r;

    /* renamed from: s */
    public boolean f48716s = false;

    /* renamed from: t */
    public int f48717t = 0;

    /* renamed from: u */
    public C17701h f48718u = new C17697a();

    /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$k */
    public static class C1179k extends RecyclerView.C0129l {

        /* renamed from: d */
        public Paint f10140d;

        /* renamed from: e */
        public int f10141e;

        public C1179k(Context context) {
            this.f10141e = C76577a.m92151b(context, 8);
            Paint paint = new Paint();
            this.f10140d = paint;
            paint.setColor(context.getResources().getColor(C0966R.color.f2929c));
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            super.mo21g(rect, view, recyclerView, wVar);
            rect.bottom = this.f10141e;
        }

        /* renamed from: h */
        public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                Canvas canvas2 = canvas;
                canvas2.drawRect((float) paddingLeft, (float) childAt.getBottom(), (float) width, (float) (childAt.getBottom() + this.f10141e), this.f10140d);
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$a */
    public class C17697a implements C17701h {
        public C17697a() {
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$b */
    public class C17698b implements MenuItem.OnMenuItemClickListener {
        public C17698b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GroupToolsManagereUI groupToolsManagereUI = GroupToolsManagereUI.this;
            int i = GroupToolsManagereUI.f48703v;
            groupToolsManagereUI.mo21201H7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$d */
    public class C17699d implements DialogInterface.OnClickListener {
        public C17699d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.roomtools.GroupToolsManagereUI", "back_dialot ok");
            GroupToolsManagereUI groupToolsManagereUI = GroupToolsManagereUI.this;
            C21505e0.m24350a(groupToolsManagereUI.f48715r, 2, groupToolsManagereUI.f48717t, groupToolsManagereUI.f48713p.f97469t.size());
            GroupToolsManagereUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$e */
    public class C17700e implements DialogInterface.OnClickListener {
        public C17700e(GroupToolsManagereUI groupToolsManagereUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.roomtools.GroupToolsManagereUI", "back_dialot cancel");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$h */
    public interface C17701h {
    }

    /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$i */
    public static class C17702i extends RecyclerView.C16631z {

        /* renamed from: G */
        public static final C20937c f48722G;

        /* renamed from: A */
        public RelativeLayout f48723A;

        /* renamed from: B */
        public ImageView f48724B;

        /* renamed from: C */
        public ImageView f48725C;

        /* renamed from: D */
        public ImageView f48726D;

        /* renamed from: E */
        public TextView f48727E;

        /* renamed from: F */
        public RelativeLayout f48728F;

        /* renamed from: z */
        public View f48729z;

        static {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59359o = C0966R.raw.app_brand_app_default_icon_for_tail;
            int b = C76577a.m92151b(MMApplicationContext.getContext(), 20);
            int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 20);
            bVar.f59354j = b;
            bVar.f59355k = b2;
            bVar.f59364t = true;
            bVar.f59346b = true;
            bVar.f59345a = true;
            f48722G = bVar.mo32666a();
        }

        public C17702i(View view) {
            super(view);
            this.f48729z = view;
            this.f48723A = (RelativeLayout) view.findViewById(C0966R.C0970id.kqp);
            this.f48724B = (ImageView) view.findViewById(C0966R.C0970id.kqi);
            this.f48725C = (ImageView) view.findViewById(C0966R.C0970id.kql);
            this.f48726D = (ImageView) view.findViewById(C0966R.C0970id.f6031vd);
            this.f48727E = (TextView) view.findViewById(C0966R.C0970id.kqr);
            this.f48728F = (RelativeLayout) view.findViewById(C0966R.C0970id.kqn);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.kqm);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$j */
    public static class C17703j extends RecyclerView.C16613e {

        /* renamed from: d */
        public Context f48730d;

        /* renamed from: e */
        public boolean f48731e;

        /* renamed from: f */
        public boolean f48732f = true;

        /* renamed from: g */
        public List<GroupToolItem> f48733g;

        /* renamed from: h */
        public C17701h f48734h;

        /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$j$a */
        public class C17704a implements C76629w0.C61144a {

            /* renamed from: a */
            public final /* synthetic */ C17702i f48735a;

            /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$j$a$a */
            public class C17705a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ WxaAttributes f48737d;

                public C17705a(WxaAttributes wxaAttributes) {
                    this.f48737d = wxaAttributes;
                }

                public void run() {
                    C17704a aVar = C17704a.this;
                    C17703j.this.mo21207F4(aVar.f48735a, this.f48737d);
                }
            }

            public C17704a(C17702i iVar) {
                this.f48735a = iVar;
            }

            /* renamed from: a */
            public void mo21208a(WxaAttributes wxaAttributes) {
                MMHandlerThread.postToMainThread(new C17705a(wxaAttributes));
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$j$b */
        public class C17706b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C17702i f48739d;

            public C17706b(C17702i iVar) {
                this.f48739d = iVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C17701h hVar = C17703j.this.f48734h;
                if (hVar != null) {
                    int j = this.f48739d.mo17363j();
                    C17697a aVar = (C17697a) hVar;
                    aVar.getClass();
                    Object tag = view.getTag();
                    if (tag instanceof GroupToolItem) {
                        boolean booleanValue = ((Boolean) ((ViewGroup) view.getParent()).getTag()).booleanValue();
                        GroupToolItem groupToolItem = (GroupToolItem) tag;
                        Log.m105925i("MicroMsg.roomtools.GroupToolsManagereUI", "iRecentUseToolsCallback click stick:%s", Boolean.valueOf(booleanValue));
                        if (booleanValue) {
                            groupToolItem.f79320f = C31543z5.m39453c();
                            GroupToolsManagereUI.this.f48713p.f97469t.remove(groupToolItem);
                            GroupToolsManagereUI.this.f48714q.addFirst(groupToolItem);
                            GroupToolsManagereUI.this.f48709i.notifyItemRemoved(j);
                            GroupToolsManagereUI.this.f48712o.notifyItemInserted(0);
                        } else if (GroupToolsManagereUI.this.f48713p.mo60797n2()) {
                            GroupToolsManagereUI groupToolsManagereUI = GroupToolsManagereUI.this;
                            C76879j.m92711E(groupToolsManagereUI, groupToolsManagereUI.getString(C0966R.string.f360244b51), "", GroupToolsManagereUI.this.getString(C0966R.string.f8028zq), false, (DialogInterface.OnClickListener) null);
                        } else {
                            GroupToolsManagereUI.this.f48713p.f97469t.addLast(groupToolItem);
                            GroupToolsManagereUI.this.f48714q.remove(groupToolItem);
                            GroupToolsManagereUI groupToolsManagereUI2 = GroupToolsManagereUI.this;
                            groupToolsManagereUI2.f48709i.notifyItemInserted(groupToolsManagereUI2.f48713p.f97469t.size() - 1);
                            GroupToolsManagereUI.this.f48712o.notifyItemRemoved(j);
                        }
                        if (booleanValue && !GroupToolsManagereUI.this.f48713p.mo60797n2()) {
                            C17703j jVar = GroupToolsManagereUI.this.f48712o;
                            jVar.f48732f = true;
                            jVar.notifyDataSetChanged();
                        } else if (!booleanValue && GroupToolsManagereUI.this.f48713p.mo60797n2()) {
                            C17703j jVar2 = GroupToolsManagereUI.this.f48712o;
                            jVar2.f48732f = false;
                            jVar2.notifyDataSetChanged();
                        }
                        GroupToolsManagereUI groupToolsManagereUI3 = GroupToolsManagereUI.this;
                        groupToolsManagereUI3.f48716s = true;
                        groupToolsManagereUI3.mo21202I7();
                        GroupToolsManagereUI.this.mo21203J7();
                    } else {
                        Log.m105924i("MicroMsg.roomtools.GroupToolsManagereUI", "iRecentUseToolsCallback click");
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$j$c */
        public class C17707c implements View.OnLongClickListener {

            /* renamed from: d */
            public final /* synthetic */ C17702i f48741d;

            public C17707c(C17702i iVar) {
                this.f48741d = iVar;
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                C17701h hVar = C17703j.this.f48734h;
                GroupToolsManagereUI.this.f48710j.mo17537u(this.f48741d);
                this.f48741d.f48728F.performHapticFeedback(0, 2);
                C117292a.m165362h(true, this, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        public C17703j(Context context, boolean z, List<GroupToolItem> list, C17701h hVar) {
            this.f48730d = context;
            this.f48731e = z;
            this.f48733g = list;
            this.f48734h = hVar;
        }

        /* renamed from: F4 */
        public final void mo21207F4(C17702i iVar, WxaAttributes wxaAttributes) {
            String str = "";
            C20828a.m22825b().mo32519h(wxaAttributes != null ? wxaAttributes.field_smallHeadURL : str, iVar.f48726D, C17702i.f48722G);
            TextView textView = iVar.f48727E;
            if (wxaAttributes != null) {
                str = wxaAttributes.field_nickname;
            }
            textView.setText(str);
        }

        public int getItemCount() {
            return this.f48733g.size();
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            Class cls = C76629w0.class;
            List<GroupToolItem> list = this.f48733g;
            if (list != null && i2 >= 0 && i2 < list.size()) {
                C17702i iVar = (C17702i) zVar;
                GroupToolItem groupToolItem = this.f48733g.get(i2);
                Log.m105919d("MicroMsg.roomtools.GroupToolsManagereUI", "onBindViewHolder() i:%s", Integer.valueOf(i));
                View view = iVar.f48729z;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (this.f48731e) {
                    iVar.f48724B.setVisibility(8);
                    iVar.f48725C.setVisibility(0);
                    iVar.f48728F.setVisibility(0);
                } else {
                    iVar.f48724B.setVisibility(0);
                    iVar.f48725C.setVisibility(8);
                    iVar.f48728F.setVisibility(4);
                }
                if (Util.isEqual(groupToolItem.f79318d, "roomaa@app.origin")) {
                    iVar.f48726D.setImageResource(C0966R.C0969drawable.bgw);
                    iVar.f48727E.setText(C0966R.string.f360243b50);
                } else if (Util.isEqual(groupToolItem.f79318d, "roomlive@app.origin")) {
                    iVar.f48726D.setImageDrawable(C76577a.m92158i(this.f48730d, C0966R.C0969drawable.bgx));
                    iVar.f48727E.setText(C0966R.string.mji);
                } else {
                    WxaAttributes N2 = ((C76629w0) C86312j.m106911c(cls)).mo106879N2(groupToolItem.f79318d);
                    if (N2 == null) {
                        ((C76629w0) C86312j.m106911c(cls)).mo106884tG(groupToolItem.f79318d, new C17704a(iVar));
                    } else {
                        mo21207F4(iVar, N2);
                    }
                }
                if (this.f48732f) {
                    View view3 = iVar.f48729z;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(Float.valueOf(1.0f));
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view4, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    View view5 = iVar.f48729z;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(Float.valueOf(0.3f));
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                    C117292a.m165359e(view6, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                ((ViewGroup) iVar.f48723A.getParent()).setTag(Boolean.valueOf(this.f48731e));
                iVar.f48723A.setTag(groupToolItem);
                iVar.f48723A.setOnClickListener(new C17706b(iVar));
                if (this.f48731e) {
                    iVar.f48728F.setOnLongClickListener(new C17707c(iVar));
                } else {
                    iVar.f48728F.setOnLongClickListener((View.OnLongClickListener) null);
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C17702i(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6821pg, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$c */
    public class C17708c implements C17710g {
        public C17708c() {
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$f */
    public static class C17709f extends C16665p.C16673d {

        /* renamed from: d */
        public List f48744d;

        /* renamed from: e */
        public C17710g f48745e;

        /* renamed from: f */
        public boolean f48746f = true;

        /* renamed from: g */
        public boolean f48747g = false;

        public C17709f(List list, C17710g gVar) {
            this.f48744d = list;
            this.f48745e = gVar;
        }

        /* renamed from: a */
        public void mo17547a(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            super.mo17547a(recyclerView, zVar);
            this.f48747g = true;
        }

        /* renamed from: c */
        public int mo17549c(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            return C16665p.C16673d.m16132g(3, 0);
        }

        /* renamed from: h */
        public void mo17553h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16631z zVar, float f, float f2, int i, boolean z) {
            if (this.f48746f) {
                ViewPropertyAnimator animate = zVar.f44854d.animate();
                zVar.f44854d.setTranslationZ(20.0f);
                animate.start();
                this.f48746f = false;
            }
            if (this.f48747g) {
                ViewPropertyAnimator animate2 = zVar.f44854d.animate();
                zVar.f44854d.setTranslationZ(0.0f);
                animate2.start();
                this.f48747g = false;
                this.f48746f = true;
            }
            super.mo17553h(canvas, recyclerView, zVar, f, f2, i, z);
        }

        /* renamed from: i */
        public boolean mo17554i(RecyclerView recyclerView, RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2) {
            int j = zVar.mo17363j();
            int j2 = zVar2.mo17363j();
            Log.m105919d("MicroMsg.roomtools.GroupToolsManagereUI", "onMove fromIndex:%s toIndex:%s", Integer.valueOf(j), Integer.valueOf(j2));
            if (j < j2) {
                int i = j;
                while (i < j2) {
                    int i2 = i + 1;
                    Collections.swap(this.f48744d, i, i2);
                    i = i2;
                }
            } else {
                for (int i3 = j; i3 > j2; i3--) {
                    Collections.swap(this.f48744d, i3, i3 - 1);
                }
            }
            recyclerView.getAdapter().notifyItemMoved(j, j2);
            C17710g gVar = this.f48745e;
            if (gVar != null) {
                GroupToolsManagereUI groupToolsManagereUI = GroupToolsManagereUI.this;
                groupToolsManagereUI.f48716s = true;
                groupToolsManagereUI.mo21202I7();
            }
            zVar.f44854d.performHapticFeedback(0, 2);
            return true;
        }

        /* renamed from: j */
        public void mo17555j(RecyclerView.C16631z zVar, int i) {
        }

        /* renamed from: k */
        public void mo17556k(RecyclerView.C16631z zVar, int i) {
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI$g */
    public interface C17710g {
    }

    /* renamed from: H7 */
    public final boolean mo21201H7() {
        if (this.f48716s) {
            C76879j.m92709C(this, getString(C0966R.string.b4s), "", getString(C0966R.string.b4u), getString(C0966R.string.b4t), false, new C17699d(), new C17700e(this));
        } else {
            C21505e0.m24350a(this.f48715r, 1, this.f48717t, this.f48713p.f97469t.size());
            finish();
        }
        return true;
    }

    /* renamed from: I7 */
    public final void mo21202I7() {
        if (this.f48716s) {
            enableOptionMenu(0, true);
        } else {
            enableOptionMenu(0, false);
        }
    }

    /* renamed from: J7 */
    public final void mo21203J7() {
        if (this.f48713p.f97469t.size() > 0) {
            this.f48704d.setVisibility(0);
        } else {
            this.f48704d.setVisibility(8);
        }
        if (this.f48714q.size() > 0) {
            this.f48706f.setVisibility(0);
        } else {
            this.f48706f.setVisibility(8);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6820pf;
    }

    public void initView() {
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        setBackGroundColorResource(C0966R.color.f2929c);
        setBackBtn(new C17698b());
        addTextOptionMenu(0, getString(C0966R.string.b4v), new C26877o0(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        mo21202I7();
        this.f48704d = (LinearLayout) findViewById(C0966R.C0970id.go4);
        this.f48705e = (RecyclerView) findViewById(C0966R.C0970id.go5);
        this.f48706f = (LinearLayout) findViewById(C0966R.C0970id.f358716go2);
        this.f48707g = (RecyclerView) findViewById(C0966R.C0970id.f358717go3);
        this.f48711n = new C1179k(getContext());
        this.f48705e.setLayoutManager(new LinearLayoutManager(this));
        this.f48705e.mo17085h0(this.f48711n);
        C17703j jVar = new C17703j(getContext(), true, this.f48713p.f97469t, this.f48718u);
        this.f48709i = jVar;
        this.f48705e.setAdapter(jVar);
        this.f48709i.notifyDataSetChanged();
        this.f48707g.setLayoutManager(new LinearLayoutManager(this));
        this.f48707g.mo17085h0(this.f48711n);
        this.f48712o = new C17703j(getContext(), false, this.f48714q, this.f48718u);
        if (this.f48713p.mo60797n2()) {
            this.f48712o.f48732f = false;
        }
        this.f48707g.setAdapter(this.f48712o);
        this.f48712o.notifyDataSetChanged();
        mo21203J7();
        C16665p pVar = new C16665p(new C17709f(this.f48713p.f97469t, new C17708c()));
        this.f48710j = pVar;
        pVar.mo17527j(this.f48705e);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(32);
        String stringExtra = getIntent().getStringExtra("key_chatroomname");
        this.f48715r = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.roomtools.GroupToolsManagereUI", "mChatRoomName is null");
            finish();
        } else {
            C36674e jo = ((C77089d) C86312j.m106911c(C77089d.class)).xx0().mo60800jo(this.f48715r);
            this.f48713p = jo;
            if (jo == null) {
                Log.m105920e("MicroMsg.roomtools.GroupToolsManagereUI", "tools is null");
                finish();
            } else {
                ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_recent_use_tools");
                if (parcelableArrayListExtra == null) {
                    this.f48714q = new LinkedList<>();
                } else {
                    this.f48714q.addAll(parcelableArrayListExtra);
                }
                Iterator<GroupToolItem> it = this.f48713p.f97469t.iterator();
                while (it.hasNext()) {
                    GroupToolItem next = it.next();
                    if (this.f48714q.contains(next)) {
                        this.f48714q.remove(next);
                    }
                }
                this.f48717t = this.f48713p.f97469t.size();
                Log.m105925i("MicroMsg.roomtools.GroupToolsManagereUI", "mChatRoomName is %s, recentUseToolItemList:%s", this.f48715r, Integer.valueOf(this.f48714q.size()));
            }
        }
        initView();
        C86709a0.m107524d().mo123455a(3546, this);
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(3546, this);
        super.onDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        mo21201H7();
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.roomtools.GroupToolsManagereUI", "onSceneEnd errType = %d, errCode = %d, errMsg = %s, scenetype:%s", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
        C89779i0 i0Var = this.f48708h;
        if (i0Var != null && i0Var.isShowing()) {
            this.f48708h.dismiss();
        }
        if (i == 0 && i2 == 0) {
            Log.m105925i("MicroMsg.roomtools.GroupToolsManagereUI", "onSceneEnd result:%s", Boolean.valueOf(((C77089d) C86312j.m106911c(C77089d.class)).xx0().update(this.f48713p, new String[0])));
            C21505e0.m24350a(this.f48715r, 3, this.f48717t, this.f48713p.f97469t.size());
            finish();
            return;
        }
        AppCompatActivity context = getContext();
        if (Util.isNullOrNil(str)) {
            str = getString(C0966R.string.k8i);
        }
        C76912y0.makeText((Context) context, (CharSequence) str, 0).show();
    }
}
