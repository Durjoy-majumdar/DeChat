package gr1;

import android.graphics.Bitmap;
import android.view.ViewParent;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import f50.C58924d;
import fs3.C59318d;
import ht1.C60171g1;
import ph1.C62294j;
import pl1.C62369u0;
import qt1.C12931a;

/* renamed from: gr1.o2 */
public interface C59670o2 extends C60171g1 {
    /* renamed from: A */
    void mo78597A(C58924d dVar, int i, int i2, long j);

    /* renamed from: g */
    boolean mo78610g();

    float getAlpha();

    Bitmap getBitmap();

    int getContextTag();

    C59318d getEventDetector();

    int getHeight();

    boolean getIsNeverStart();

    boolean getIsShouldPlayResume();

    ViewParent getParentView();

    Object getPlayer();

    Object getTag(int i);

    C59662l2 getVideoAdapter();

    String getVideoMediaId();

    C59673q2 getVideoMediaInfo();

    int getWidth();

    /* renamed from: n */
    void mo78638n();

    /* renamed from: o */
    void mo78639o(C62369u0 u0Var, boolean z, FeedData feedData);

    /* renamed from: p */
    C62294j mo78640p(long j);

    /* renamed from: q */
    int mo51226q();

    /* renamed from: s */
    boolean mo51228s();

    void setAlpha(float f);

    void setContextTag(int i);

    void setFinderVideoPlayTrace(C12931a aVar);

    void setFullScreenEnjoy(boolean z);

    void setIOnlineVideoProxy(C55394a aVar);

    void setIsShouldPlayResume(boolean z);

    void setIsShowBasicControls(boolean z);

    void setPreloadedView(boolean z);

    void setScaleType(C96814a.C96817e eVar);

    void setTag(int i, Object obj);

    void setTag(Object obj);

    void setVideoMuteListener(C59674r2 r2Var);

    void setVideoPlayLifecycle(C59684w2 w2Var);

    /* renamed from: t */
    void mo51232t();

    /* renamed from: v */
    boolean mo78668v();

    /* renamed from: w */
    void mo78669w();

    /* renamed from: y */
    boolean mo78670y();
}
