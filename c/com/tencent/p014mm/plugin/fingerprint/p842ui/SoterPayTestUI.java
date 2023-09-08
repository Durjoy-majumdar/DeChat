package com.tencent.p014mm.plugin.fingerprint.p842ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import p623nr.C76954e;
import rt3.C22252b;
import tt3.C22551c;
import tt3.C22553e;
import tt3.C64998b;
import xt3.C53448e;

/* renamed from: com.tencent.mm.plugin.fingerprint.ui.SoterPayTestUI */
public class SoterPayTestUI extends MMActivity implements C11385n {

    /* renamed from: com.tencent.mm.plugin.fingerprint.ui.SoterPayTestUI$a */
    public class C56757a implements View.OnClickListener {
        public C56757a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fingerprint/ui/SoterPayTestUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.SoterPayTestUI", "hy: start get challenge");
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123455a(1586, SoterPayTestUI.this);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f((C117747y) ((C76954e) C86312j.m106911c(C76954e.class)).mx0(0));
            C117292a.m165361g(this, "com/tencent/mm/plugin/fingerprint/ui/SoterPayTestUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fingerprint.ui.SoterPayTestUI$b */
    public class C56758b implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.fingerprint.ui.SoterPayTestUI$b$a */
        public class C56759a implements C64998b<C22551c> {
            public C56759a(C56758b bVar) {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo24821a(C22553e eVar) {
                C22551c cVar = (C22551c) eVar;
            }
        }

        public C56758b(SoterPayTestUI soterPayTestUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fingerprint/ui/SoterPayTestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.SoterPayTestUI", "hy: regen and upload ask");
            C22252b.m25807d(new C56759a(this), false, (C53448e) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/fingerprint/ui/SoterPayTestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fingerprint.ui.SoterPayTestUI$c */
    public class C56760c implements View.OnClickListener {
        public C56760c(SoterPayTestUI soterPayTestUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fingerprint/ui/SoterPayTestUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/fingerprint/ui/SoterPayTestUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.arl;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(C0966R.C0970id.jy_).setOnClickListener(new C56757a());
        findViewById(C0966R.C0970id.iki).setOnClickListener(new C56758b(this));
        findViewById(C0966R.C0970id.ikj).setOnClickListener(new C56760c(this));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.SoterPayTestUI", "hy: on scene end: errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C76912y0.makeText((Context) this, (CharSequence) String.format("on scene end: errType: %d, errCode: %d, errMsg: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}), 1).show();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(yVar.getType(), this);
    }
}
