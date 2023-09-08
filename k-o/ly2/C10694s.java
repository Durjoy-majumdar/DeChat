package ly2;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import ei3.C86522b;
import java.util.HashMap;
import ky2.C10428a;
import ky2.C10431b;
import ky2.C10432i;
import ky2.C10439o;
import nj3.C76912y0;
import wd3.C15153w0;

@C86522b(onProcess = {C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: ly2.s */
public class C10694s extends C86301e implements C10432i {
    /* renamed from: BD */
    public C72996z1 mo10736BD() {
        return null;
    }

    public void I40() {
        Log.m105928w("MicroMsg.TeenModeServiceProxy", "notifyTeenModeDataChanged not implemented in non-MM process");
    }

    /* renamed from: JD */
    public boolean mo10738JD(int i, String str) {
        return false;
    }

    /* renamed from: MV */
    public void mo10739MV(C10439o oVar) {
        Log.m105928w("MicroMsg.TeenModeServiceProxy", "registerTeenModeDataChangedListener not implemented in non-MM process");
    }

    /* renamed from: Mn */
    public int mo10740Mn() {
        Log.m105928w("MicroMsg.TeenModeServiceProxy", "getFinderOption not implemented in non-MM process");
        return 0;
    }

    public int Oh0() {
        Log.m105928w("MicroMsg.TeenModeServiceProxy", "getMiniProgramOption not implemented in non-MM process");
        return 0;
    }

    public boolean Pj0() {
        Log.m105928w("MicroMsg.TeenModeServiceProxy", "isHideTeenModeEntrance not implemented in non-MM process");
        return false;
    }

    public boolean Ql0(Context context, int i, String str, String str2, String str3, String str4, byte[] bArr, C15153w0 w0Var) {
        return false;
    }

    /* renamed from: WJ */
    public void mo10744WJ(Context context, String str, String str2, long j, long j2, String str3, String str4, Boolean bool) {
    }

    /* renamed from: WR */
    public <T extends C10428a> void mo10745WR(int i, T t) {
    }

    public void Wg0(Activity activity, int i) {
    }

    public void Wq0(Activity activity, int i, int i2, String str, String str2, String str3, String str4, boolean z, C10432i.C10433a aVar) {
        C10685q.vx0(activity, i, i2, str, str2, str3, str4, z, aVar);
    }

    public void Xp0(int i, C10431b bVar) {
    }

    public void dt0(Context context, String str, String str2, String str3, long j) {
    }

    /* renamed from: e */
    public boolean mo10750e() {
        Log.m105928w("MicroMsg.TeenModeServiceProxy", "isTeenMode not implemented in non-MM process");
        return false;
    }

    /* renamed from: fd */
    public int mo10751fd() {
        Log.m105928w("MicroMsg.TeenModeServiceProxy", "getBizAcctOption not implemented in non-MM process");
        return 0;
    }

    /* renamed from: gg */
    public void mo10752gg() {
    }

    /* renamed from: jE */
    public C10428a mo10753jE(int i) {
        return null;
    }

    public HashMap<Integer, String> k50() {
        return null;
    }

    /* renamed from: m4 */
    public void mo10755m4(Context context) {
        C76912y0.m92769h(context, context.getString(C0966R.string.jxq), C0966R.raw.icons_outlined_umbrella);
    }

    /* renamed from: rY */
    public void mo10756rY(C10439o oVar) {
        Log.m105928w("MicroMsg.TeenModeServiceProxy", "unregisterTeenModeDataChangedListener not implemented in non-MM process");
    }

    /* renamed from: ri */
    public void mo10757ri(int i) {
        Log.m105928w("MicroMsg.TeenModeServiceProxy", "report not implemented in non-MM process");
    }

    /* renamed from: sX */
    public boolean mo10758sX(Activity activity, int i, int i2, String str, String str2, String str3, String str4, byte[] bArr, C15153w0 w0Var, DialogInterface.OnDismissListener onDismissListener) {
        return true;
    }

    public void setScene(int i) {
        Log.m105928w("MicroMsg.TeenModeServiceProxy", "setScene not implemented in non-MM process");
    }

    public void t60(Context context) {
    }

    /* renamed from: ts */
    public C10431b mo10761ts(int i) {
        return null;
    }

    public boolean xm0(String str) {
        return false;
    }
}
