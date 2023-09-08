package a93;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import ke3.C88144b;
import nj3.C88990b;
import p261wl.C15510f;
import p261wl.C38166b;
import p640ox.C77049b;
import p92.C117994a;
import p92.C117997g;
import te3.C110959d13;
import te3.C110964i13;
import te3.C51173ry;
import te3.i25;

/* renamed from: a93.f */
public final class C39527f extends C117997g {

    /* renamed from: d */
    public static final LinkedList<C27831a> f106123d = new LinkedList<>();

    /* renamed from: a93.f$a */
    public interface C27831a {
        /* renamed from: E2 */
        void mo55629E2(MultiTaskInfo multiTaskInfo);
    }

    /* renamed from: a93.f$b */
    public interface C27832b extends C15510f {
        /* renamed from: E2 */
        void mo55630E2(MultiTaskInfo multiTaskInfo);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39527f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: L1 */
    public void mo36001L1(View view, MultiTaskInfo multiTaskInfo, C110959d13 d132, Object obj) {
        C87412m.m108594g(multiTaskInfo, "info");
        C87412m.m108594g(d132, "animateData");
        i25 i25 = new i25();
        try {
            i25.parseFrom(multiTaskInfo.field_data);
        } catch (Exception unused) {
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", i25.f135051e);
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, i25.f135054h);
        intent.putExtra("KMutilTaskInfo", multiTaskInfo);
        intent.putExtra("webview_bg_color_rsID", 17170445);
        C51173ry ryVar = new C51173ry();
        ryVar.f141210d = d132;
        if (view != null) {
            Context context = view.getContext();
            C87412m.m108593f(context, "view.context");
            C110964i13 i132 = (C110964i13) ((C77049b) C86312j.m106911c(C77049b.class)).mo72346DT(context, 5);
            ryVar.f141211e = i132 != null ? i132.f332057d : null;
        }
        intent.putExtra("key_multi_task_common_info", ryVar.toByteArray());
        intent.putExtra("float_ball_key", multiTaskInfo.field_id);
        Log.m105924i("MicroMsg.LuggageWebMultiTaskUIC", "onMultiTaskItemClick, id = " + multiTaskInfo.field_id);
        C88144b.m109791i(getActivity(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C88990b.m111197f(getActivity());
    }

    /* renamed from: d3 */
    public void mo62143d3(Object obj) {
    }

    /* renamed from: e3 */
    public void mo62144e3(MultiTaskInfo multiTaskInfo, int i) {
        C87412m.m108594g(multiTaskInfo, "obj");
        for (C27831a E2 : f106123d) {
            E2.mo55629E2(multiTaskInfo);
        }
        C38166b.m41755b(C27832b.class, new C27830e(multiTaskInfo));
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
        getRootView().findViewById(super.getLayoutId());
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
    public C39527f(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
