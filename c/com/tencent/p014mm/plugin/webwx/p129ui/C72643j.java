package com.tencent.p014mm.plugin.webwx.p129ui;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C1308r0;
import com.tencent.p014mm.sdk.platformtools.Util;
import e62.C75554c;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.webwx.ui.j */
public final class C72643j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75554c.C75555b f211355d;

    /* renamed from: e */
    public final /* synthetic */ C72632c f211356e;

    /* renamed from: com.tencent.mm.plugin.webwx.ui.j$a */
    public static final class C72644a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C75554c.C75555b f211357d;

        /* renamed from: e */
        public final /* synthetic */ C72632c f211358e;

        public C72644a(C75554c.C75555b bVar, C72632c cVar) {
            this.f211357d = bVar;
            this.f211358e = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C75554c.m90587j1(this.f211357d, C1308r0.kPushLoginUrlAutoLoginSettingEnabled);
            CheckBox checkBox = this.f211358e.f211329X;
            checkBox.setChecked(!checkBox.isChecked());
            this.f211357d.f221961C = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webwx.ui.j$b */
    public static final class C72645b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C72645b f211359d = new C72645b();

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public C72643j(C75554c.C75555b bVar, C72632c cVar) {
        this.f211355d = bVar;
        this.f211356e = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75554c.C75555b bVar = this.f211355d;
        if (bVar.f221961C) {
            C75554c.m90587j1(bVar, C1308r0.kPushLoginUrlAutoLoginSettingDisabled);
            this.f211355d.f221961C = false;
            CheckBox checkBox = this.f211356e.f211329X;
            checkBox.setChecked(!checkBox.isChecked());
        } else {
            Context context = this.f211356e.f211335z;
            C76879j.m92707A(context, Util.nullAs(bVar.f221969w, context.getString(C0966R.string.lhr)), this.f211356e.f211335z.getString(C0966R.string.lht), this.f211356e.f211335z.getString(C0966R.string.lhs), this.f211356e.f211335z.getString(C0966R.string.f7926wf), new C72644a(this.f211355d, this.f211356e), C72645b.f211359d);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
