package kq1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import rx3.C13598b0;

/* renamed from: kq1.e */
public final class C61136e extends UIComponent implements C98124g.C98125a {

    /* renamed from: d */
    public String f174047d;

    /* renamed from: e */
    public String f174048e;

    /* renamed from: f */
    public String f174049f;

    /* renamed from: g */
    public C32226l<? super String, C13598b0> f174050g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61136e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        Log.m105924i("FinderPostAudioUIC", "mediaId:" + str + " startRet:" + i + " sceneResult:" + dVar);
        int i2 = dVar != null ? dVar.field_retCode : 0;
        String str2 = "";
        if ((i == 0 || i == -21005) && i2 == 0) {
            String str3 = this.f174049f;
            boolean z2 = true;
            if (str3 == null || !str3.equals(str)) {
                z2 = false;
            }
            if (z2 && dVar != null) {
                String str4 = dVar.field_fileUrl;
                if (str4 != null) {
                    str2 = str4;
                }
                C32226l<? super String, C13598b0> lVar = this.f174050g;
                if (lVar != null) {
                    lVar.invoke(str2);
                }
            }
            return 0;
        }
        C32226l<? super String, C13598b0> lVar2 = this.f174050g;
        if (lVar2 != null) {
            lVar2.invoke(str2);
        }
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61136e(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
