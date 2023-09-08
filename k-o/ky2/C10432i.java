package ky2;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.storage.C72996z1;
import di3.C7335d;
import java.util.HashMap;
import wd3.C15153w0;

/* renamed from: ky2.i */
public interface C10432i extends C7335d {

    /* renamed from: ky2.i$a */
    public interface C10433a {
        void onResult(int i, String str, boolean z);
    }

    /* renamed from: BD */
    C72996z1 mo10736BD();

    void I40();

    /* renamed from: JD */
    boolean mo10738JD(int i, String str);

    /* renamed from: MV */
    void mo10739MV(C10439o oVar);

    /* renamed from: Mn */
    int mo10740Mn();

    int Oh0();

    boolean Pj0();

    boolean Ql0(Context context, int i, String str, String str2, String str3, String str4, byte[] bArr, C15153w0 w0Var);

    /* renamed from: WJ */
    void mo10744WJ(Context context, String str, String str2, long j, long j2, String str3, String str4, Boolean bool);

    /* renamed from: WR */
    <T extends C10428a> void mo10745WR(int i, T t);

    void Wg0(Activity activity, int i);

    void Wq0(Activity activity, int i, int i2, String str, String str2, String str3, String str4, boolean z, C10433a aVar);

    void Xp0(int i, C10431b bVar);

    void dt0(Context context, String str, String str2, String str3, long j);

    /* renamed from: e */
    boolean mo10750e();

    /* renamed from: fd */
    int mo10751fd();

    /* renamed from: gg */
    void mo10752gg();

    /* renamed from: jE */
    C10428a mo10753jE(int i);

    HashMap<Integer, String> k50();

    /* renamed from: m4 */
    void mo10755m4(Context context);

    /* renamed from: rY */
    void mo10756rY(C10439o oVar);

    /* renamed from: ri */
    void mo10757ri(int i);

    /* renamed from: sX */
    boolean mo10758sX(Activity activity, int i, int i2, String str, String str2, String str3, String str4, byte[] bArr, C15153w0 w0Var, DialogInterface.OnDismissListener onDismissListener);

    void setScene(int i);

    void t60(Context context);

    /* renamed from: ts */
    C10431b mo10761ts(int i);

    boolean xm0(String str);
}
