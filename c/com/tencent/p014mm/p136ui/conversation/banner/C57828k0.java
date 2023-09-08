package com.tencent.p014mm.p136ui.conversation.banner;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import nj3.C76879j;
import p385u2.C111105a;
import p447aw.C103918d;
import p918s2.C90111a;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.banner.k0 */
public class C57828k0 extends C78802b implements View.OnClickListener {

    /* renamed from: h */
    public View f165453h = this.f230569f.findViewById(C0966R.C0970id.a7f);

    /* renamed from: com.tencent.mm.ui.conversation.banner.k0$a */
    public class C57829a implements DialogInterface.OnClickListener {
        public C57829a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_STORAGE_PERMISSION_BANNER_1_CLOSED_FLAG_BOOLEAN_SYNC, Boolean.TRUE);
            C57828k0.this.mo7970e();
        }
    }

    public C57828k0(Context context) {
        super(context);
        View findViewById = this.f230569f.findViewById(C0966R.C0970id.bem);
        ((ImageView) this.f230569f.findViewById(C0966R.C0970id.hky)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_filled_error, this.f230570g.get().getResources().getColor(C0966R.color.f2966ao)));
        ((TextView) this.f230569f.findViewById(C0966R.C0970id.hkw)).setText(C0966R.string.aiu);
        this.f230569f.setOnClickListener(this);
        findViewById.setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo7968a() {
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.c5s;
    }

    /* renamed from: c */
    public int mo7974c() {
        return 4;
    }

    /* renamed from: e */
    public boolean mo7970e() {
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_STORAGE_PERMISSION_BANNER_1_CLOSED_FLAG_BOOLEAN_SYNC, false);
        boolean z = C111105a.m151499a((Activity) this.f230570g.get(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0 && C90111a.m112742f((Activity) this.f230570g.get(), "android.permission.WRITE_EXTERNAL_STORAGE") && Environment.getExternalStorageDirectory().getAbsolutePath().toLowerCase().contains("appclone");
        if (g || !z) {
            View view = this.f165453h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f230569f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view5 = this.f165453h;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f230569f;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return super.mo7970e();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.StoragePermissionBanner", "onClick, %d", Integer.valueOf(view.getId()));
        Activity activity = (Activity) this.f230570g.get();
        if (view.getId() == C0966R.C0970id.bem) {
            C76879j.m92754y(activity, activity.getString(C0966R.string.aiv), activity.getString(C0966R.string.a3h), activity.getString(C0966R.string.hhz), new C57829a());
            C117407d.INSTANCE.idkeyStat(462, 25, 1, true);
        } else {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1((Activity) this.f230570g.get(), "android.permission.WRITE_EXTERNAL_STORAGE", 33, "", "");
            C117407d.INSTANCE.idkeyStat(462, 24, 1, true);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/StoragePermissionBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
