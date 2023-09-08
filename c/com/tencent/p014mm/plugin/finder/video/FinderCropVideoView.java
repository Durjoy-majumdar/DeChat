package com.tencent.p014mm.plugin.finder.video;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import f50.C58924d;
import fs3.C59318d;
import fy3.C32226l;
import gr1.C59662l2;
import gr1.C59670o2;
import gr1.C59673q2;
import gr1.C59674r2;
import gr1.C59684w2;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60157c5;
import java.util.LinkedList;
import kotlin.Metadata;
import p143ds.C58434o;
import ph1.C62294j;
import pl1.C62369u0;
import qt1.C12931a;
import sx3.C110818d0;
import te3.C48889bp1;
import te3.C64477jr2;
import te3.C64689rq2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010E\u001a\u0004\u0018\u00010D\u0012\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bH\u0010IJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0012\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\u0003H\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020\"H\u0016J\b\u0010&\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020\"H\u0016J\b\u0010*\u001a\u00020'H\u0016J\n\u0010,\u001a\u0004\u0018\u00010+H\u0016J\b\u0010.\u001a\u00020-H\u0016J\u000e\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020/R\"\u00108\u001a\u00020\u00038\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>¨\u0006J"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderCropVideoView;", "Lcom/tencent/mm/plugin/finder/video/FinderVideoView;", "Lgr1/o2;", "", "isFull", "Lrx3/b0;", "setFullScreenEnjoy", "Lgr1/r2;", "onMuteListener", "setVideoMuteListener", "Lqt1/a;", "videoPlayTrace", "setFinderVideoPlayTrace", "Lgr1/l2;", "getVideoAdapter", "", "getPlayer", "Lht1/c5;", "_callback", "setIMMVideoViewCallback", "Lgr1/w2;", "videoPlayLifecycle", "setVideoPlayLifecycle", "getIsNeverStart", "Lgr1/q2;", "getVideoMediaInfo", "getIsShouldPlayResume", "shouldPlayResume", "setIsShouldPlayResume", "focused", "setVideoViewFocused", "isPreview", "setPreview", "getVideoViewFocused", "", "tag", "setContextTag", "getContextTag", "getCurrentPlaySecond", "", "getCurrentPlayMs", "getVideoDuration", "getVideoDurationMs", "Landroid/view/ViewParent;", "getParentView", "Landroid/view/View;", "getVideoView", "Landroid/graphics/Matrix;", "matrix", "setRootMatrix", "y1", "Z", "y", "()Z", "setPreloadedView", "(Z)V", "isPreloadedView", "A1", "I", "getVideoRootWidth", "()I", "setVideoRootWidth", "(I)V", "videoRootWidth", "B1", "getVideoRootHeight", "setVideoRootHeight", "videoRootHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderCropVideoView */
public final class FinderCropVideoView extends FinderVideoView implements C59670o2 {

    /* renamed from: A1 */
    public int f161654A1;

    /* renamed from: B1 */
    public int f161655B1;

    /* renamed from: w1 */
    public boolean f161656w1;

    /* renamed from: x1 */
    public int f161657x1 = -1;

    /* renamed from: y1 */
    public boolean f161658y1;

    /* renamed from: z1 */
    public CropLayout f161659z1;

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderCropVideoView$a */
    public static final class C56496a extends C87413o implements C32226l<Matrix, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ Matrix f161660d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56496a(Matrix matrix) {
            super(1);
            this.f161660d = matrix;
        }

        public Object invoke(Object obj) {
            Matrix matrix = (Matrix) obj;
            C87412m.m108594g(matrix, LocaleUtil.ITALIAN);
            matrix.set(this.f161660d);
            return Boolean.TRUE;
        }
    }

    public FinderCropVideoView(Context context) {
        super(context);
    }

    /* renamed from: A */
    public void mo78597A(C58924d dVar, int i, int i2, long j) {
        C87412m.m108594g(dVar, "txPlayer");
    }

    /* renamed from: B */
    public boolean mo51221B(Integer num) {
        boolean z = this.f161926m1;
        start();
        return z;
    }

    /* renamed from: H */
    public void mo79392H() {
        super.mo79392H();
        View findViewById = findViewById(C0966R.C0970id.d85);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_crop_layout)");
        CropLayout cropLayout = (CropLayout) findViewById;
        this.f161659z1 = cropLayout;
        cropLayout.setEnableTouch(false);
        CropLayout cropLayout2 = this.f161659z1;
        if (cropLayout2 != null) {
            cropLayout2.setEnableScale(false);
            CropLayout cropLayout3 = this.f161659z1;
            if (cropLayout3 != null) {
                cropLayout3.setEnableFling(false);
                CropLayout cropLayout4 = this.f161659z1;
                if (cropLayout4 != null) {
                    cropLayout4.setEnableOverScroll(false);
                } else {
                    C87412m.m108603p("cropLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("cropLayout");
                throw null;
            }
        } else {
            C87412m.m108603p("cropLayout");
            throw null;
        }
    }

    /* renamed from: J */
    public int mo79393J() {
        return C0966R.C0971layout.a6a;
    }

    /* renamed from: d */
    public void mo78609d() {
    }

    /* renamed from: g */
    public boolean mo78610g() {
        return get_isPreviewing();
    }

    public int getContextTag() {
        return this.f161657x1;
    }

    public long getCurrentPlayMs() {
        return (long) getCurrPosMs();
    }

    public int getCurrentPlaySecond() {
        return getCurrPosSec();
    }

    public C59318d getEventDetector() {
        return null;
    }

    public boolean getIsNeverStart() {
        return this.f161926m1;
    }

    public boolean getIsShouldPlayResume() {
        return this.f161924k1;
    }

    public ViewParent getParentView() {
        return getParent();
    }

    public Object getPlayer() {
        return this;
    }

    public C59662l2 getVideoAdapter() {
        return null;
    }

    public int getVideoDuration() {
        C62369u0 u0Var;
        C64689rq2 f;
        C64477jr2 jr22;
        C59673q2 mediaInfo = getMediaInfo();
        if (mediaInfo == null || (u0Var = mediaInfo.f170495e) == null || (f = u0Var.mo87421f()) == null || (jr22 = f.f185281u) == null) {
            return getVideoDurationSec();
        }
        int videoDurationSec = getVideoDurationSec();
        int i = jr22.f183833g;
        int i2 = jr22.f183832f;
        return videoDurationSec > (i - i2) / 1000 ? (i - i2) / 1000 : getVideoDurationSec();
    }

    public long getVideoDurationMs() {
        int i;
        C62369u0 u0Var;
        C64689rq2 f;
        C64477jr2 jr22;
        C59673q2 mediaInfo = getMediaInfo();
        if (mediaInfo == null || (u0Var = mediaInfo.f170495e) == null || (f = u0Var.mo87421f()) == null || (jr22 = f.f185281u) == null) {
            i = getVideoDurationSec();
        } else {
            int videoDurationSec = getVideoDurationSec();
            int i2 = jr22.f183833g;
            int i3 = jr22.f183832f;
            if (videoDurationSec > (i2 - i3) / 1000) {
                return (long) (i2 - i3);
            }
            i = getVideoDurationSec();
        }
        return ((long) i) * 1000;
    }

    public C59673q2 getVideoMediaInfo() {
        return getMediaInfo();
    }

    public final int getVideoRootHeight() {
        return this.f161655B1;
    }

    public final int getVideoRootWidth() {
        return this.f161654A1;
    }

    public View getVideoView() {
        return this;
    }

    public boolean getVideoViewFocused() {
        return this.f161923j1;
    }

    /* renamed from: k0 */
    public void mo79396k0() {
        if (!this.f161656w1) {
            CropLayout cropLayout = this.f161659z1;
            if (cropLayout != null) {
                cropLayout.mo154437C();
                C48889bp1 videoMatrix = getVideoMatrix();
                if (videoMatrix != null && videoMatrix.f131245d.size() == 9) {
                    Matrix matrix = new Matrix();
                    LinkedList<Float> linkedList = videoMatrix.f131245d;
                    C87412m.m108593f(linkedList, "it.value");
                    matrix.setValues(C110818d0.m150950v0(linkedList));
                    setRootMatrix(matrix);
                    return;
                }
                return;
            }
            C87412m.m108603p("cropLayout");
            throw null;
        }
    }

    /* renamed from: n */
    public void mo78638n() {
    }

    /* renamed from: o */
    public void mo78639o(C62369u0 u0Var, boolean z, FeedData feedData) {
        C87412m.m108594g(u0Var, "video");
        C87412m.m108594g(feedData, "feedData");
        mo79632m0(u0Var, z, feedData);
    }

    /* renamed from: p */
    public C62294j mo78640p(long j) {
        return null;
    }

    /* renamed from: s */
    public boolean mo51228s() {
        return false;
    }

    public void setContextTag(int i) {
        this.f161657x1 = i;
    }

    public void setFinderVideoPlayTrace(C12931a aVar) {
    }

    public void setFullScreenEnjoy(boolean z) {
        this.f161656w1 = z;
    }

    public void setIMMVideoViewCallback(C60157c5 c5Var) {
        C87412m.m108594g(c5Var, "_callback");
        super.setIMMVideoViewCallback(c5Var);
    }

    public void setIsShouldPlayResume(boolean z) {
        setShouldPlayResume(z);
    }

    public void setPreloadedView(boolean z) {
        this.f161658y1 = z;
    }

    public void setPreview(boolean z) {
        set_isPreviewing(z);
    }

    public final void setRootMatrix(Matrix matrix) {
        C87412m.m108594g(matrix, "matrix");
        if (getMediaInfo() != null) {
            C59673q2 mediaInfo = getMediaInfo();
            C87412m.m108591d(mediaInfo);
            C94554a M1 = ((C58434o) C86312j.m106911c(C58434o.class)).mo82774M1(mediaInfo.f170492b);
            Matrix matrix2 = new Matrix(matrix);
            CropLayout cropLayout = this.f161659z1;
            if (cropLayout != null) {
                RelativeLayout relativeLayout = this.f283590i;
                C87412m.m108593f(relativeLayout, "videoRoot");
                int i = this.f161654A1;
                if (i <= 0) {
                    i = M1.f273445c;
                }
                int i2 = i;
                int i3 = this.f161655B1;
                if (i3 <= 0) {
                    i3 = M1.f273446d;
                }
                cropLayout.mo154438D(relativeLayout, i2, i3, new Matrix(), CropLayout.C97279e.CENTER_CROP, new C56496a(matrix2));
                return;
            }
            C87412m.m108603p("cropLayout");
            throw null;
        }
    }

    public void setVideoMuteListener(C59674r2 r2Var) {
        C87412m.m108594g(r2Var, "onMuteListener");
        setMuteListener(r2Var);
    }

    public void setVideoPlayLifecycle(C59684w2 w2Var) {
        setLifecycle(w2Var);
    }

    public final void setVideoRootHeight(int i) {
        this.f161655B1 = i;
    }

    public final void setVideoRootWidth(int i) {
        this.f161654A1 = i;
    }

    public void setVideoViewFocused(boolean z) {
        setViewFocused(z);
    }

    /* renamed from: t */
    public void mo51232t() {
    }

    /* renamed from: v */
    public boolean mo78668v() {
        return false;
    }

    /* renamed from: x */
    public boolean mo51233x(double d, boolean z, int i) {
        return mo79629i0((int) d, z);
    }

    /* renamed from: y */
    public boolean mo78670y() {
        return this.f161658y1;
    }

    public FinderCropVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
