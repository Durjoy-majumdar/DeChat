package aa2;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import ba2.C39749d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43861d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import e00.C45518r0;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import ke3.C88144b;
import p640ox.C77049b;
import p92.C117994a;
import p92.C117997g;
import te3.C110959d13;
import te3.C110964i13;
import te3.C51173ry;
import te3.i25;

/* renamed from: aa2.r */
public final class C39530r extends C117997g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39530r(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: L1 */
    public void mo36001L1(View view, MultiTaskInfo multiTaskInfo, C110959d13 d132, Object obj) {
        MultiTaskInfo multiTaskInfo2 = multiTaskInfo;
        C110959d13 d133 = d132;
        Class cls = C45696d.class;
        Class cls2 = C77049b.class;
        C87412m.m108594g(multiTaskInfo2, "info");
        C87412m.m108594g(d133, "animateData");
        i25 i25 = new i25();
        try {
            i25.parseFrom(multiTaskInfo2.field_data);
        } catch (Exception unused) {
        }
        Intent intent = new Intent();
        C39749d.m42535b(intent, i25);
        int i = i25.f135069z;
        C51173ry ryVar = new C51173ry();
        ryVar.f141210d = d133;
        if (view != null) {
            Context context = view.getContext();
            C87412m.m108593f(context, "view.context");
            if (((C77049b) C86312j.m106911c(cls2)).mo72353Ru(context) != null) {
                Context context2 = view.getContext();
                C87412m.m108593f(context2, "view.context");
                C110964i13 i132 = (C110964i13) ((C77049b) C86312j.m106911c(cls2)).mo72346DT(context2, 5);
                ryVar.f141211e = i132 != null ? i132.f332057d : null;
            }
        }
        intent.putExtra("rawUrl", i25.f135051e);
        intent.putExtra("convertActivityFromTranslucent", false);
        intent.putExtra("key_multi_task_common_info", ryVar.toByteArray());
        intent.putExtra("float_ball_key", multiTaskInfo2.field_id);
        intent.putExtra("key_enable_teen_mode_check", true);
        intent.putExtra("nextAnimIn", C0966R.C0968anim.f2393bw);
        intent.putExtra("currentAnimOut", 0);
        intent.putExtra("minimize_secene", 0);
        intent.putExtra("webpageTitle", i25.f135054h);
        if (i > -1) {
            boolean z = i == 5;
            int i2 = i25.f135063t;
            int i3 = i25.f135064u;
            if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(i2) && ((C45696d) C86709a0.m107533q(cls)).Ms0(MMApplicationContext.getContext(), i25.f135051e, i, z, i2, i3, intent)) {
                Log.m105924i("MicroMsg.WebMultiTaskUIC", "openWebPage, use fast Load");
                return;
            }
        }
        C88144b.m109791i(getActivity(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        ((C43861d) ((C45518r0) C86312j.m106911c(C45518r0.class)).mo70761lQ()).getClass();
        C43861d.f118786d.remove(multiTaskInfo2.field_id);
    }

    /* renamed from: d3 */
    public void mo62143d3(Object obj) {
    }

    /* renamed from: e3 */
    public void mo62144e3(MultiTaskInfo multiTaskInfo, int i) {
        C87412m.m108594g(multiTaskInfo, "info");
        Log.m105919d("MicroMsg.WebMultiTaskUIC", "onMultiTaskItemDelete, name:%s", multiTaskInfo.field_showData.f183752e);
        ((C43861d) ((C45518r0) C86312j.m106911c(C45518r0.class)).mo70761lQ()).mo68423f(multiTaskInfo);
    }

    /* renamed from: g3 */
    public void mo62145g3() {
    }

    public int getLayoutId() {
        return super.getLayoutId();
    }

    /* renamed from: i3 */
    public void mo62146i3() {
    }

    /* renamed from: j3 */
    public void mo62155j3(MultiTaskInfo multiTaskInfo, int i) {
        C87412m.m108594g(multiTaskInfo, "info");
        Log.m105919d("MicroMsg.WebMultiTaskUIC", "onTaskBarItemExposed, name:%s", multiTaskInfo.field_showData.f183752e);
        i25 i25 = new i25();
        try {
            i25.parseFrom(multiTaskInfo.field_data);
            int i2 = i25.f135069z;
            String str = i25.f135051e;
            if (i2 > -1 && !Util.isNullOrNil(str)) {
                int i3 = i25.f135063t;
                Log.m105919d("MicroMsg.WebMultiTaskUIC", "addToPreload, name:%s", multiTaskInfo.field_showData.f183752e);
                ((C45696d) C86709a0.m107533q(C45696d.class)).Tn0(str, i2, i3, new Object[0]);
            }
            ((C43861d) ((C45518r0) C86312j.m106911c(C45518r0.class)).mo70761lQ()).mo68422e(multiTaskInfo);
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.WebMultiTaskUIC", "WebMultiTaskData parse fail", th);
        }
    }

    /* renamed from: k3 */
    public boolean mo62147k3(int i) {
        return i == 2;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onBeforeFinish(Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
    }

    public void onCreate(Bundle bundle) {
    }

    public void onCreateAfter(Bundle bundle) {
    }

    public void onCreateBefore(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return false;
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStartActivityForResult(Intent intent, int i, Bundle bundle) {
    }

    public void onStop() {
    }

    public void onUserVisibleFocused() {
    }

    public void onUserVisibleUnFocused() {
    }

    /* renamed from: z */
    public C117994a.C117996b mo36002z() {
        return C117994a.C117996b.MODE_SHOW_MULTI_SCENE;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39530r(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
