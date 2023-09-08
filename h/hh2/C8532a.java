package hh2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p182kk.C61104a;
import p447aw.C103918d;

/* renamed from: hh2.a */
public class C8532a {

    /* renamed from: a */
    public static final C8532a f27585a = new C8532a();

    /* renamed from: a */
    public final Intent mo9442a(Activity activity, String str, int i) {
        Boolean bool;
        if (i == 0) {
            if (C61104a.m71651g(activity) || C61104a.m71669y(activity) || C61104a.m71665u(activity)) {
                Log.m105924i("MicroMsg.VideoCaptureJumper", "startStoryCapture, voip or multitalk running");
                bool = Boolean.FALSE;
            } else if (!(activity instanceof Activity) || ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(activity, "android.permission.CAMERA", 16, "", "")) {
                Log.m105925i("MicroMsg.VideoCaptureJumper", "startStoryCapture %s", Util.getStack().toString());
                bool = Boolean.TRUE;
            } else {
                Log.m105924i("MicroMsg.VideoCaptureJumper", "not get enough permission checkCamera");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                Log.m105924i("MicroMsg.VideoCaptureJumper", "not get enough permission");
                return null;
            }
        }
        try {
            return new Intent(activity, Class.forName(str));
        } catch (ClassNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.VideoCaptureJumper", e, "buildIntent failed!", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo9443b(Context context, int i, int i2) {
        if (i != -1 && i2 != -1) {
            ((Activity) context).overridePendingTransition(i, -1);
        }
    }

    /* renamed from: c */
    public boolean mo9444c(Context context, int i, int i2, int i3, RecordConfigProvider recordConfigProvider) {
        Activity activity = (Activity) context;
        Intent a = mo9442a(activity, "com.tencent.mm.plugin.recordvideo.activity.MMRecordUI", 0);
        if (a == null) {
            return false;
        }
        a.putExtra("KEY_PARAMS_CONFIG", recordConfigProvider);
        a.putExtra("KEY_PARAMS_TO_WHERE", 0);
        a.putExtra("KEY_PARAMS_EXIT_ANIM", i3);
        Log.m105925i("MicroMsg.VideoCaptureJumper", "configProvider: %s", recordConfigProvider);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(a);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper", "jumpToCaptureViewForResult", "(Landroid/content/Context;IIILcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        mo9443b(context, i2, i3);
        return true;
    }

    /* renamed from: d */
    public boolean mo9445d(Context context, int i, int i2, int i3, RecordConfigProvider recordConfigProvider, int i4) {
        Activity activity = (Activity) context;
        Intent a = mo9442a(activity, "com.tencent.mm.plugin.recordvideo.activity.MMRecordUI", 0);
        if (a == null) {
            return false;
        }
        a.putExtra("KEY_PARAMS_CONFIG", recordConfigProvider);
        a.putExtra("KEY_PARAMS_TO_WHERE", 0);
        a.putExtra("KEY_PARAMS_EXIT_ANIM", i3);
        a.putExtra("KEY_PARAMS_SELECTED_BIZ_INT", i4);
        Log.m105925i("MicroMsg.VideoCaptureJumper", "configProvider: %s", recordConfigProvider);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(a);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper", "jumpToCaptureViewForResult", "(Landroid/content/Context;IIILcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        mo9443b(context, i2, i3);
        return true;
    }

    /* renamed from: e */
    public boolean mo9446e(Context context, int i, int i2, int i3, RecordConfigProvider recordConfigProvider, int i4, int i5) {
        Activity activity = (Activity) context;
        Intent a = mo9442a(activity, "com.tencent.mm.plugin.recordvideo.activity.MMRecordUI", i4);
        if (a == null) {
            return false;
        }
        a.putExtra("KEY_PARAMS_CONFIG", recordConfigProvider);
        a.putExtra("KEY_PARAMS_TO_WHERE", i4);
        a.putExtra("KEY_PARAMS_SELECTED_BIZ_INT", i5);
        a.putExtra("KEY_PARAMS_EXIT_ANIM", i3);
        Log.m105925i("MicroMsg.VideoCaptureJumper", "configProvider: %s", recordConfigProvider);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(a);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper", "jumpToEditViewForResult", "(Landroid/content/Context;IIILcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;II)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        mo9443b(context, i2, i3);
        return true;
    }
}
