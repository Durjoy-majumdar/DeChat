package mb1;

import com.tencent.p014mm.plugin.facedetect.C85185b;
import com.tencent.youtu.ytcommon.YTCommonExInterface;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface;
import di3.C86312j;
import p564iq.C87790d;

/* renamed from: mb1.e */
public class C109599e {

    /* renamed from: a */
    public YTPoseDetectInterface.PoseDetectOnFrame f328117a = null;

    /* renamed from: b */
    public C10774a f328118b;

    /* renamed from: mb1.e$a */
    public interface C10774a {
    }

    static {
        m148897a();
        YTCommonExInterface.setIsEnabledLog(true);
        YTCommonExInterface.setIsEnabledNativeLog(true);
    }

    /* renamed from: a */
    public static void m148897a() {
        Class cls = C87790d.class;
        if (C85185b.vx0()) {
            ((C87790d) C86312j.m106911c(cls)).mo122034R0("YTCommon");
            ((C87790d) C86312j.m106911c(cls)).mo122034R0("YTFaceTrackPro2");
            ((C87790d) C86312j.m106911c(cls)).mo122034R0("YTNextCV");
            ((C87790d) C86312j.m106911c(cls)).mo122034R0("YTPoseDetect");
        }
    }
}
