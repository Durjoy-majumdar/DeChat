package kr1;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.recordvideo.activity.MMRecordUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lh2.C99466t0;
import qh2.C101198e;
import qo3.C77389a;
import qo3.C77398g;
import th2.C110992d;

/* renamed from: kr1.k */
public final class C99171k extends C99466t0 {

    /* renamed from: g */
    public WeImageView f290808g;

    /* renamed from: h */
    public C101198e f290809h;

    /* renamed from: i */
    public View f290810i;

    /* renamed from: j */
    public final Context f290811j;

    /* renamed from: kr1.k$a */
    public static final class C61146a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C61146a f174082d = new C61146a();

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: kr1.k$b */
    public static final class C99172b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C99171k f290812d;

        public C99172b(C99171k kVar) {
            this.f290812d = kVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            long j = 0;
            if (true && true) {
                j = 1;
            }
            C115669n.INSTANCE.idkeyStat(1371, 195, j, false);
            Context context = this.f290812d.f290808g.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
            ((MMRecordUI) context).mo129783I7();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99171k(WeImageView weImageView, C101198e eVar, View view) {
        super(weImageView, eVar);
        C87412m.m108594g(weImageView, "closeImg");
        C87412m.m108594g(eVar, "finderRecordStatus");
        this.f290808g = weImageView;
        this.f290809h = eVar;
        this.f290810i = view;
        Context context = weImageView.getContext();
        this.f290811j = context;
        this.f290808g.setContentDescription(C76577a.m92166q(context, C0966R.string.f7570jz));
    }

    /* renamed from: a */
    public final void mo138537a() {
        C77398g.C77402i iVar = new C77398g.C77402i(this.f290811j);
        iVar.mo107550c(C0966R.string.d7l);
        iVar.mo107552e(C0966R.string.d7m);
        iVar.f225714b.f225638U = this.f290811j.getResources().getColor(C0966R.color.Red_100);
        iVar.f225714b.f225637T = this.f290811j.getResources().getColor(C0966R.color.f3154h3);
        iVar.mo107551d(C0966R.string.d7k);
        C61146a aVar = C61146a.f174082d;
        C77389a aVar2 = iVar.f225714b;
        aVar2.f225621D = aVar;
        aVar2.f225620C = new C99172b(this);
        iVar.mo107548a().show();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/video/plugin/FinderRecordClosePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.RecordClosePlugin", "RecordClosePlugin close");
        C110992d dVar = C110992d.f332425a;
        dVar.mo162670d(3);
        dVar.mo162669b(3);
        dVar.mo162673g(this.f291629f);
        C101198e.C62622a.m73576a(this.f290809h, C101198e.C101199b.UI_FINISH, (Bundle) null, 2, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordClosePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f290810i;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/plugin/FinderRecordClosePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordClosePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f290808g.setVisibility(i);
    }
}
