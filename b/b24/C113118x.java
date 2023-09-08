package b24;

import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.x */
public class C113118x extends C113107m0 {

    /* renamed from: f */
    public int f338505f = 0;

    public C113118x() {
        this.f338498e = ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET;
    }

    /* renamed from: h */
    public Boolean mo165621h() {
        if (this.f338496c < 2) {
            return Boolean.FALSE;
        }
        int f = C117790util.m166184f(this.f338497d, 4);
        this.f338505f = f;
        return f + 2 > this.f338496c ? Boolean.FALSE : Boolean.TRUE;
    }
}
