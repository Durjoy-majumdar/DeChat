package com.tencent.p014mm.plugin.voip.p475ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.plugin.voip.model.C106400y;
import com.tencent.p014mm.plugin.voip.model.C57469x;
import com.tencent.p014mm.plugin.voip.model.y$$b;
import com.tencent.p014mm.plugin.voip.p475ui.VoipBaseFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86737h0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l31.C61212e;
import l33.C109247e;
import n33.C109681a;
import nj3.C88989a;
import nj3.C88990b;
import o31.C11345b;
import o31.C76986a;
import p492dn.C107054l;
import p625nu.C61901d;
import uu1.C111222b;
import vo3.C90852c;

@C86737h0
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.voip.ui.VideoActivity */
public class VideoActivity extends MMActivity implements C106447f, VoipBaseFragment.C106436g, ServiceConnection, C61901d.C61902a {

    /* renamed from: d */
    public C109681a f317867d;

    /* renamed from: e */
    public C106449h f317868e;

    /* renamed from: com.tencent.mm.plugin.voip.ui.VideoActivity$a */
    public class C106416a implements SwipeBackLayout.C19846b {
        public C106416a() {
        }

        /* renamed from: a */
        public void mo26396a(int i) {
            if (i == 1) {
                C88990b.m111194c(VideoActivity.this, (C88990b.C61771c) null);
                VideoActivity.this.getSwipeBackLayout().mo26381c(true);
            }
        }

        /* renamed from: b */
        public void mo26397b() {
            VideoActivity.this.getSwipeBackLayout().setNeedRequestActivityTranslucent(true);
            VideoActivity.this.getSwipeBackLayout().mo26381c(false);
            C88990b.m111193b(VideoActivity.this);
        }
    }

    /* renamed from: B */
    public void mo152906B() {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152906B();
        }
    }

    /* renamed from: F3 */
    public void mo152907F3(int i, String str) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152907F3(i, str);
        }
    }

    /* renamed from: G */
    public void mo152908G(int i) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152908G(i);
        }
    }

    /* renamed from: G0 */
    public void mo152909G0(int i) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152909G0(i);
        }
    }

    /* renamed from: H7 */
    public C109681a mo152910H7() {
        if (this.f317867d == null) {
            if (getIntent().hasExtra("cached_engine_id")) {
                this.f317867d = ((C111222b) C86312j.m106911c(C111222b.class)).mo161936nW(this);
            } else {
                this.f317867d = new VideoActivityController(this);
            }
            C109681a aVar = this.f317867d;
            this.f317868e = aVar instanceof C106449h ? (C106449h) aVar : null;
        }
        return this.f317867d;
    }

    /* renamed from: I7 */
    public void mo152911I7() {
        super.finish();
    }

    /* renamed from: J1 */
    public /* synthetic */ void mo152912J1(List list) {
    }

    /* renamed from: J7 */
    public void mo152913J7(Bundle bundle) {
        super.onCreate(bundle);
        setTitleVisibility(8);
    }

    /* renamed from: K7 */
    public void mo152914K7(boolean z) {
        super.setScreenEnable(z);
    }

    /* renamed from: Q2 */
    public void mo152915Q2(String str) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152915Q2(str);
        }
    }

    /* renamed from: R */
    public /* synthetic */ void mo152916R(int i) {
    }

    /* renamed from: T6 */
    public void mo152917T6(long j) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152917T6(j);
        }
    }

    /* renamed from: V */
    public void mo152918V(int i) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152918V(i);
        }
    }

    /* renamed from: V0 */
    public void mo152919V0() {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152919V0();
        }
    }

    /* renamed from: Z1 */
    public void mo152920Z1(boolean z) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152920Z1(z);
        }
    }

    /* renamed from: a5 */
    public void mo152921a5() {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152921a5();
        }
    }

    /* renamed from: c2 */
    public void mo152922c2() {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152922c2();
        }
    }

    public void dealContentView(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "dealContentView", "(Landroid/view/View;)V", this, array);
        mo152910H7().dealContentView(view);
        C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "dealContentView", "(Landroid/view/View;)V");
    }

    /* renamed from: e3 */
    public void mo152923e3(int i) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152909G0(i);
        }
    }

    /* renamed from: e5 */
    public void mo152924e5(int i, int i2) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152924e5(i, i2);
        }
    }

    /* renamed from: f0 */
    public void mo152925f0(boolean z, boolean z2) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152925f0(z, z2);
        }
    }

    public void finish() {
        C117292a.m165355a("com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "finish", "()V", this);
        mo152910H7().finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "finish", "()V");
    }

    public int getForceOrientation() {
        return mo152910H7().getForceOrientation();
    }

    public int getLayoutId() {
        return mo152910H7().getLayoutId();
    }

    public Resources getResources() {
        return Build.VERSION.SDK_INT <= 23 ? super.getOriginalResources() : super.getResources();
    }

    /* renamed from: h0 */
    public void mo152926h0(boolean z) {
    }

    /* renamed from: i3 */
    public Context mo152927i3() {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            return hVar.mo152927i3();
        }
        return null;
    }

    /* renamed from: i5 */
    public void mo152928i5() {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152928i5();
        }
    }

    /* renamed from: k3 */
    public void mo152929k3(boolean z) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152929k3(z);
        }
    }

    public boolean noActionBar() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo152910H7().onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (!mo152910H7().onBackPressed()) {
            super.onBackPressed();
        }
    }

    public void onBusinessPermissionDenied(String str) {
    }

    public void onBusinessPermissionGranted(String str) {
        C106400y yVar = C57469x.m66239a().f317450A;
        synchronized (yVar.f317715h) {
            yVar.f317724q.post(new y$$b(yVar));
        }
        C109247e.xx0().f317333b.mo149993e0();
    }

    public void onConfigurationChanged(Configuration configuration) {
        mo152910H7().onConfigurationChanged(configuration);
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        if (C109247e.vx0().f333458r == 0) {
            C109247e.vx0().f333458r = Util.nowMilliSecond();
        }
        setTransparentTheme(true);
        mo152910H7().onCreate(bundle);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.VideoActivity).mo86179qs(this, C76986a.Voip);
        getSwipeBackLayout().setDragListener(new C106416a());
    }

    public void onDestroy() {
        mo152910H7().onDestroy();
        if (C85861e4.m106115b(this)) {
            C85861e4.m106117d(VideoActivity.class, 0);
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        arrayList.add(keyEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", this, array);
        boolean z = mo152910H7().onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
        C117292a.m165362h(z, this, "com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "onKeyDown", "(ILandroid/view/KeyEvent;)Z");
        return z;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mo152910H7().onNewIntent(intent);
    }

    public void onOrientationChange(int i) {
    }

    public void onPause() {
        super.onPause();
        mo152910H7().onPause();
    }

    public void onPostResume() {
        super.onPostResume();
        mo152910H7().onPostResume();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        mo152910H7().onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        mo152910H7().onResume();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.onServiceConnected(componentName, iBinder);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.onServiceDisconnected(componentName);
        }
    }

    public void onStart() {
        super.onStart();
        mo152910H7().onStart();
    }

    public void onStop() {
        mo152910H7().onStop();
        super.onStop();
    }

    public boolean onSwipeBackFinish() {
        super.onSwipeBackFinish();
        mo152910H7().onSwipeBackFinish();
        onStop();
        return true;
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        mo152910H7().onTrimMemory(i);
    }

    public void onUserLeaveHint() {
        if (!mo152910H7().onUserLeaveHint()) {
            super.onUserLeaveHint();
        }
    }

    /* renamed from: p0 */
    public void mo152934p0(C107054l.C107055a aVar) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152934p0(aVar);
        }
    }

    /* renamed from: r */
    public void mo152935r() {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.mo152935r();
        }
    }

    public void setMute(boolean z) {
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.setMute(z);
        }
    }

    public void setRequestedOrientation(int i) {
        if (Build.VERSION.SDK_INT == 26) {
            try {
                super.setRequestedOrientation(i);
            } catch (Exception unused) {
                Log.m105928w("MicroMsg.Voip.VideoActivity", "setRequestedOrientation() couldn't be called successfully");
            }
        } else {
            super.setRequestedOrientation(i);
        }
    }

    public void setScreenEnable(boolean z) {
        super.setScreenEnable(z);
        C106449h hVar = this.f317868e;
        if (hVar != null) {
            hVar.setScreenEnable(z);
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        mo152910H7().importUIComponents(hashSet);
    }
}
