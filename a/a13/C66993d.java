package a13;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import qo3.C77390c0;
import te3.xh4;

/* renamed from: a13.d */
public class C66993d extends C77390c0 {

    /* renamed from: d */
    public View f192461d;

    /* renamed from: e */
    public View f192462e;

    /* renamed from: f */
    public View f192463f = this.f192461d.findViewById(C0966R.C0970id.h07);

    /* renamed from: g */
    public View f192464g = this.f192461d.findViewById(C0966R.C0970id.f359458l01);

    /* renamed from: h */
    public View f192465h = this.f192461d.findViewById(C0966R.C0970id.cxs);

    /* renamed from: a13.d$a */
    public class C66994a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66998e f192466d;

        /* renamed from: e */
        public final /* synthetic */ xh4 f192467e;

        public C66994a(C66993d dVar, C66998e eVar, xh4 xh4) {
            this.f192466d = eVar;
            this.f192467e = xh4;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.TopStory.MorePopupWindow", "onClick unlike");
            C66998e eVar = this.f192466d;
            if (eVar != null) {
                eVar.mo25002c(this.f192467e);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a13.d$b */
    public class C66995b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66998e f192468d;

        /* renamed from: e */
        public final /* synthetic */ xh4 f192469e;

        public C66995b(C66993d dVar, C66998e eVar, xh4 xh4) {
            this.f192468d = eVar;
            this.f192469e = xh4;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.TopStory.MorePopupWindow", "onClick favorite");
            C66998e eVar = this.f192468d;
            if (eVar != null) {
                eVar.mo25001b(this.f192469e);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a13.d$c */
    public class C66996c implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66998e f192470d;

        /* renamed from: e */
        public final /* synthetic */ xh4 f192471e;

        public C66996c(C66993d dVar, C66998e eVar, xh4 xh4) {
            this.f192470d = eVar;
            this.f192471e = xh4;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Log.m105924i("MicroMsg.TopStory.MorePopupWindow", "onLongClick favorite");
            C66998e eVar = this.f192470d;
            if (eVar != null) {
                eVar.mo25000a(this.f192471e);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: a13.d$d */
    public class C66997d implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C66998e f192472d;

        public C66997d(C66993d dVar, C66998e eVar) {
            this.f192472d = eVar;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C66998e eVar = this.f192472d;
            if (eVar != null) {
                eVar.onDismiss();
            }
        }
    }

    /* renamed from: a13.d$e */
    public interface C66998e {
        /* renamed from: a */
        void mo25000a(xh4 xh4);

        /* renamed from: b */
        void mo25001b(xh4 xh4);

        /* renamed from: c */
        void mo25002c(xh4 xh4);

        void onDismiss();
    }

    public C66993d(Context context, xh4 xh4, C66998e eVar) {
        super(context, C0966R.style.f8830zb);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cal, (ViewGroup) null, false);
        this.f192461d = inflate;
        this.f192462e = inflate.findViewById(C0966R.C0970id.gze);
        this.f192464g.setOnClickListener(new C66994a(this, eVar, xh4));
        this.f192465h.setOnClickListener(new C66995b(this, eVar, xh4));
        this.f192465h.setOnLongClickListener(new C66996c(this, eVar, xh4));
        setContentView(this.f192461d);
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new C66997d(this, eVar));
    }

    /* renamed from: c */
    public void mo90957c(View view, boolean z, int i, int i2) {
        boolean z2 = z;
        super.show();
        int[] a = C66999e.m79151a(view.getContext(), view, this.f192461d, z2);
        if (z2) {
            View view2 = this.f192463f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f192462e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view6 = this.f192463f;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view8 = this.f192462e;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view9 = view8;
            C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        a[0] = a[0] + i;
        a[1] = a[1] + i2;
        Window window = getWindow();
        window.setLayout(-2, -2);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.x = a[0];
        attributes.y = a[1];
        attributes.gravity = 8388659;
        window.setAttributes(attributes);
    }
}
