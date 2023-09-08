package jk3;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.C105918j;
import com.tencent.p014mm.plugin.multitask.C105919k;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import ik3.C98700c;
import j20.C117292a;
import k20.C9556a;
import kr0.C88274h0;
import nj3.C76912y0;
import p262wm.C22921c;
import p640ox.C77049b;
import p92.C117994a;
import p92.C117997g;
import qo3.C47883u;
import qo3.C77426q;
import te3.C101828pe0;
import te3.C110959d13;
import te3.C110964i13;
import te3.C51173ry;

/* renamed from: jk3.a */
public final class C98945a extends C117997g {

    /* renamed from: jk3.a$a */
    public static final class C98946a implements C47883u {
        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            if (z) {
                ((C105918j) C86312j.m106911c(C105918j.class)).mo151027r5(0, "MultiTaskForSnapshotMinusScreen", 1048576);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98945a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: L1 */
    public void mo36001L1(View view, MultiTaskInfo multiTaskInfo, C110959d13 d132, Object obj) {
        MultiTaskInfo multiTaskInfo2 = multiTaskInfo;
        C110959d13 d133 = d132;
        Class cls = C22921c.class;
        C87412m.m108594g(multiTaskInfo2, "info");
        C87412m.m108594g(d133, "animateData");
        if (multiTaskInfo2.field_data != null) {
            Log.m105925i("MicroMsg.FileMultiTaskUIC", "handleBallInfoClicked, openFile t:%s", multiTaskInfo2);
            AppCompatActivity activity = getActivity();
            String str = null;
            if (!C98700c.m128469Z()) {
                C76912y0.m92771j(activity, (View) null);
                return;
            }
            C101828pe0 pe02 = new C101828pe0();
            try {
                pe02.parseFrom(multiTaskInfo2.field_data);
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.FileMultiTaskUIC", "handleMultiTaskInfoClicked", th);
            }
            String str2 = pe02.f299161e;
            if (!C86013q1.m106450k(str2)) {
                Log.m105925i("MicroMsg.FileMultiTaskUIC", "handleBallInfoClicked() %s not exist", str2);
                C77426q qVar = new C77426q(activity);
                qVar.mo107606r("");
                qVar.mo107595g(activity.getString(C0966R.string.cvo));
                qVar.mo107589a(true);
                qVar.mo107600l(new C98946a());
                qVar.mo107603o();
                ((C105918j) C86312j.m106911c(C105918j.class)).mo151020Ub(multiTaskInfo2.field_id);
                return;
            }
            C51173ry ryVar = new C51173ry();
            ryVar.f141210d = d133;
            if (view != null) {
                Context context = view.getContext();
                C87412m.m108593f(context, "it.context");
                C110964i13 i132 = (C110964i13) ((C77049b) C86312j.m106911c(C77049b.class)).mo72346DT(context, 5);
                if (i132 != null) {
                    str = i132.f332057d;
                }
                ryVar.f141211e = str;
            }
            if (pe02.f299160d) {
                Intent intent = new Intent();
                intent.setClassName(activity, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
                ((C105919k) C86312j.m106911c(C105919k.class)).mo151042ZS(intent, pe02);
                intent.putExtra("key_multi_task_common_info", ryVar.toByteArray());
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    extras.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 9);
                }
                intent.addFlags(268435456);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = activity;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/multitask/uic/FileMultiTaskUIC", "onMultiTaskItemClick", "(Landroid/view/View;Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;Lcom/tencent/mm/protocal/protobuf/MultiTaskAnimData;Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/ui/chatting/multitask/uic/FileMultiTaskUIC", "onMultiTaskItemClick", "(Landroid/view/View;Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;Lcom/tencent/mm/protocal/protobuf/MultiTaskAnimData;Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            String str3 = pe02.f299162f;
            String str4 = pe02.f299163g;
            String str5 = pe02.f299164h;
            boolean z = pe02.f299166j;
            if (!Util.isNullOrNil(str5)) {
                ((C88274h0) C86312j.m106911c(C88274h0.class)).j30(activity, str2, str3, str4, z, str5);
            } else if (((C22921c) C86312j.m106911c(cls)).ap0(str2, str3, "", 9, ryVar)) {
                ((C22921c) C86312j.m106911c(cls)).mo35882TI(getActivity(), str2, str3, "", 9, ryVar);
            }
        }
    }

    /* renamed from: d3 */
    public void mo62143d3(Object obj) {
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
        return i == 4;
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
    public C98945a(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
