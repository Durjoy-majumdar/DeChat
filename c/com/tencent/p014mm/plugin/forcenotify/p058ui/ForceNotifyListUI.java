package com.tencent.p014mm.plugin.forcenotify.p058ui;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import dv1.C58435m;
import eb0.C31543z5;
import ev1.C31726h;
import fv1.C32183a;
import gy3.C87412m;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C11184p0;
import p687sr.C64156g;
import p910lj.C76701a;
import uo3.C78253a;
import z04.C112551y;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "<init>", "()V", "a", "b", "plugin-force-notify_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI */
public final class ForceNotifyListUI extends MMActivity implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public final String f162689d = "MicroMsg.ForceNotifyListUI";

    /* renamed from: e */
    public RecyclerView f162690e;

    /* renamed from: f */
    public C56762a f162691f;

    /* renamed from: g */
    public View f162692g;

    /* renamed from: h */
    public View f162693h;

    /* renamed from: i */
    public final ArrayList<C31726h> f162694i = new ArrayList<>();

    /* renamed from: j */
    public final int[] f162695j = new int[2];

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI$a */
    public final class C56762a extends RecyclerView.C16613e<C56763b> {
        public C56762a() {
        }

        public int getItemCount() {
            return ForceNotifyListUI.this.f162694i.size();
        }

        public int getItemViewType(int i) {
            C31726h hVar = ForceNotifyListUI.this.f162694i.get(i);
            C87412m.m108593f(hVar, "data[position]");
            String str = hVar.field_UserName;
            C87412m.m108593f(str, "info.field_UserName");
            return C112551y.m153808h(str, "@app", false, 2, (Object) null) ? 1 : 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            TextView textView;
            C56763b bVar = (C56763b) zVar;
            C87412m.m108594g(bVar, "holder");
            C31726h hVar = ForceNotifyListUI.this.f162694i.get(i);
            C87412m.m108593f(hVar, "data[position]");
            C31726h hVar2 = hVar;
            int itemViewType = getItemViewType(i);
            bVar.f162700D = hVar2.field_UserName;
            bVar.f162701E = hVar2.field_ForcePushId;
            ViewPropertyAnimator animate = bVar.f162699C.animate();
            if (animate != null) {
                animate.cancel();
            }
            if (!(hVar2.field_Status == 1)) {
                bVar.f162703z.setVisibility(8);
                bVar.f162698B.setVisibility(0);
            } else {
                bVar.f162703z.setVisibility(0);
                bVar.f162698B.setVisibility(8);
                bVar.f162703z.setText(ForceNotifyListUI.this.getContext().getResources().getString(C0966R.string.f1q, new Object[]{new SimpleDateFormat("HH:mm").format(new Date(hVar2.field_ExpiredTime))}));
            }
            if (itemViewType == 1 && (textView = bVar.f162697A) != null) {
                textView.setText(hVar2.field_ExtInfo);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = C85868k2.m106137b(ForceNotifyListUI.this.getContext()).inflate(C0966R.C0971layout.asb, (ViewGroup) null);
            if (i == 0) {
                ((ViewStub) inflate.findViewById(C0966R.C0970id.hht)).inflate();
            } else {
                ((ViewStub) inflate.findViewById(C0966R.C0970id.gu4)).inflate();
            }
            ForceNotifyListUI forceNotifyListUI = ForceNotifyListUI.this;
            C87412m.m108593f(inflate, "view");
            return new C56763b(forceNotifyListUI, inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI$b */
    public final class C56763b extends RecyclerView.C16631z implements View.OnCreateContextMenuListener, C11184p0 {

        /* renamed from: A */
        public final TextView f162697A;

        /* renamed from: B */
        public final LinearLayout f162698B;

        /* renamed from: C */
        public final View f162699C;

        /* renamed from: D */
        public String f162700D;

        /* renamed from: E */
        public String f162701E;

        /* renamed from: F */
        public final /* synthetic */ ForceNotifyListUI f162702F;

        /* renamed from: z */
        public final TextView f162703z;

        /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI$b$a */
        public static final class C56764a implements View.OnTouchListener {

            /* renamed from: d */
            public final /* synthetic */ ForceNotifyListUI f162704d;

            public C56764a(ForceNotifyListUI forceNotifyListUI) {
                this.f162704d = forceNotifyListUI;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                C87412m.m108594g(view, "view");
                C87412m.m108594g(motionEvent, "event");
                if (motionEvent.getAction() == 0) {
                    this.f162704d.f162695j[0] = (int) motionEvent.getRawX();
                    this.f162704d.f162695j[1] = (int) motionEvent.getRawY();
                }
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI$b$b */
        public static final class C56765b implements View.OnLongClickListener {

            /* renamed from: d */
            public final /* synthetic */ ForceNotifyListUI f162705d;

            /* renamed from: e */
            public final /* synthetic */ C56763b f162706e;

            public C56765b(ForceNotifyListUI forceNotifyListUI, C56763b bVar) {
                this.f162705d = forceNotifyListUI;
                this.f162706e = bVar;
            }

            public final boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                Log.m105924i(this.f162705d.f162689d, "OnLongClick!");
                C78253a aVar = new C78253a(this.f162705d.getContext());
                C56763b bVar = this.f162706e;
                int[] iArr = this.f162705d.f162695j;
                aVar.mo108272g(view, 0, 0, bVar, bVar, iArr[0], iArr[1]);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI$b$c */
        public static final class C56766c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ForceNotifyListUI f162707d;

            /* renamed from: e */
            public final /* synthetic */ C56763b f162708e;

            /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI$b$c$a */
            public static final class C56767a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C56763b f162709d;

                public C56767a(C56763b bVar) {
                    this.f162709d = bVar;
                }

                public final void run() {
                    this.f162709d.f162699C.animate().start();
                }
            }

            public C56766c(ForceNotifyListUI forceNotifyListUI, C56763b bVar) {
                this.f162707d = forceNotifyListUI;
                this.f162708e = bVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105925i(this.f162707d.f162689d, "resetView onClick! username:%s", this.f162708e.f162700D);
                ((C58435m) C86312j.m106911c(C58435m.class)).mo55959Dy(this.f162708e.f162700D);
                this.f162708e.f162699C.animate().rotation(360.0f).setDuration(300).withEndAction(new C56767a(this.f162708e)).start();
                C117292a.m165361g(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56763b(ForceNotifyListUI forceNotifyListUI, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f162702F = forceNotifyListUI;
            View findViewById = view.findViewById(C0966R.C0970id.a27);
            C87412m.m108591d(findViewById);
            ImageView imageView = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.kpm);
            C87412m.m108591d(findViewById2);
            TextView textView = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.kkt);
            C87412m.m108591d(findViewById3);
            this.f162703z = (TextView) findViewById3;
            this.f162697A = (TextView) view.findViewById(C0966R.C0970id.l2n);
            View findViewById4 = view.findViewById(C0966R.C0970id.iqc);
            C87412m.m108591d(findViewById4);
            LinearLayout linearLayout = (LinearLayout) findViewById4;
            this.f162698B = linearLayout;
            View findViewById5 = view.findViewById(C0966R.C0970id.ijb);
            C87412m.m108591d(findViewById5);
            this.f162699C = findViewById5;
            View findViewById6 = view.findViewById(C0966R.C0970id.br8);
            findViewById6.setOnTouchListener(new C56764a(forceNotifyListUI));
            findViewById6.setOnLongClickListener(new C56765b(forceNotifyListUI, this));
            linearLayout.setOnClickListener(new C56766c(forceNotifyListUI, this));
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            C87412m.m108594g(contextMenu, "menu");
            contextMenu.add(this.f162702F.getContext().getResources().getString(C0966R.string.f1k));
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (!NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext())) {
                C76701a.makeText((Context) this.f162702F.getContext(), this.f162702F.getResources().getText(C0966R.string.f360087a11), 1).show();
                return;
            }
            this.f162702F.f162694i.remove(mo17363j());
            C56762a aVar = this.f162702F.f162691f;
            C87412m.m108591d(aVar);
            aVar.notifyItemRemoved(mo17363j());
            ((C58435m) C86312j.m106911c(C58435m.class)).mo55962W0(this.f162701E, 4);
            if (this.f162702F.f162694i.isEmpty()) {
                RecyclerView recyclerView = this.f162702F.f162690e;
                C87412m.m108591d(recyclerView);
                recyclerView.setVisibility(8);
                View view = this.f162702F.f162693h;
                C87412m.m108591d(view);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI$c */
    public static final class C56768c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ForceNotifyListUI f162710d;

        public C56768c(ForceNotifyListUI forceNotifyListUI) {
            this.f162710d = forceNotifyListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f162710d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI$d */
    public static final class C56769d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ForceNotifyListUI f162711d;

        /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI$d$a */
        public static final class C56770a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ForceNotifyListUI f162712d;

            public C56770a(ForceNotifyListUI forceNotifyListUI) {
                this.f162712d = forceNotifyListUI;
            }

            public final void run() {
                String str = this.f162712d.f162689d;
                Log.m105924i(str, "[onCreate] load size=" + this.f162712d.f162694i.size());
                C56762a aVar = this.f162712d.f162691f;
                C87412m.m108591d(aVar);
                aVar.notifyDataSetChanged();
                View view = this.f162712d.f162692g;
                C87412m.m108591d(view);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onCreate$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onCreate$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (this.f162712d.f162694i.isEmpty()) {
                    RecyclerView recyclerView = this.f162712d.f162690e;
                    C87412m.m108591d(recyclerView);
                    recyclerView.setVisibility(8);
                    View view2 = this.f162712d.f162693h;
                    C87412m.m108591d(view2);
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onCreate$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onCreate$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                RecyclerView recyclerView2 = this.f162712d.f162690e;
                C87412m.m108591d(recyclerView2);
                recyclerView2.setVisibility(0);
            }
        }

        public C56769d(ForceNotifyListUI forceNotifyListUI) {
            this.f162711d = forceNotifyListUI;
        }

        public final void run() {
            this.f162711d.f162694i.clear();
            this.f162711d.f162694i.addAll(((C58435m) C86312j.m106911c(C58435m.class)).vx0());
            ForceNotifyListUI forceNotifyListUI = this.f162711d;
            forceNotifyListUI.runOnUiThread(new C56770a(forceNotifyListUI));
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI$e */
    public static final class C56771e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ForceNotifyListUI f162713d;

        /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI$e$a */
        public static final class C56772a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ForceNotifyListUI f162714d;

            public C56772a(ForceNotifyListUI forceNotifyListUI) {
                this.f162714d = forceNotifyListUI;
            }

            public final void run() {
                if (this.f162714d.f162694i.isEmpty()) {
                    RecyclerView recyclerView = this.f162714d.f162690e;
                    C87412m.m108591d(recyclerView);
                    recyclerView.setVisibility(8);
                    View view = this.f162714d.f162693h;
                    C87412m.m108591d(view);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onNotifyChange$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$onNotifyChange$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                RecyclerView recyclerView2 = this.f162714d.f162690e;
                C87412m.m108591d(recyclerView2);
                recyclerView2.setVisibility(0);
                C56762a aVar2 = this.f162714d.f162691f;
                C87412m.m108591d(aVar2);
                aVar2.notifyDataSetChanged();
            }
        }

        public C56771e(ForceNotifyListUI forceNotifyListUI) {
            this.f162713d = forceNotifyListUI;
        }

        public final void run() {
            this.f162713d.f162694i.clear();
            this.f162713d.f162694i.addAll(((C58435m) C86312j.m106911c(C58435m.class)).vx0());
            ForceNotifyListUI forceNotifyListUI = this.f162713d;
            forceNotifyListUI.runOnUiThread(new C56772a(forceNotifyListUI));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.asf;
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C32183a.f85554d.add(this);
        setMMTitle((int) C0966R.string.f18);
        setBackBtn(new C56768c(this));
        this.f162692g = findViewById(C0966R.C0970id.g2z);
        this.f162693h = findViewById(C0966R.C0970id.cj7);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.foz);
        this.f162690e = recyclerView;
        C87412m.m108591d(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f162691f = new C56762a();
        RecyclerView recyclerView2 = this.f162690e;
        C87412m.m108591d(recyclerView2);
        recyclerView2.setAdapter(this.f162691f);
        ((C119157j) C119157j.f356862d).mo183875f(new C56769d(this));
        ((C64156g) C86312j.m106911c(C64156g.class)).mo58063xl("", 1, C31543z5.m39453c() / ((long) 1000));
    }

    public void onDestroy() {
        super.onDestroy();
        C32183a.f85554d.remove(this);
        ((C64156g) C86312j.m106911c(C64156g.class)).mo58063xl("", 2, C31543z5.m39453c() / ((long) 1000));
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Log.m105925i(this.f162689d, "[onNotifyChange] event:%s", str);
        ((C119157j) C119157j.f356862d).mo183875f(new C56771e(this));
    }
}
