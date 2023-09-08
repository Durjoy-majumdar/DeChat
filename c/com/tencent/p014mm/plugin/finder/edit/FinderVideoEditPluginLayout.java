package com.tencent.p014mm.plugin.finder.edit;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.cropvideo.EditorVideoPlayView;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew;
import com.tencent.p014mm.sdk.platformtools.Log;
import fh2.C97882i;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.regex.Pattern;
import jh2.C108745d;
import kotlin.Metadata;
import lh2.C109339f0;
import o40.C61926c;
import qh2.C101198e;
import th2.C110992d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/edit/FinderVideoEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew;", "Landroid/view/View;", "getPlayerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.edit.FinderVideoEditPluginLayout */
public final class FinderVideoEditPluginLayout extends EditorVideoPluginLayoutNew {

    /* renamed from: E */
    public Matrix f270600E;

    /* renamed from: com.tencent.mm.plugin.finder.edit.FinderVideoEditPluginLayout$a */
    public static final class C93750a extends EditorVideoPlayView {
        public C93750a(Context context) {
            super(context);
        }

        /* renamed from: L */
        public void mo128672L() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoEditPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public View getPlayerView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(-16777216);
        C93750a aVar = new C93750a(getContext());
        setPreviewPlugin(new C109339f0(aVar, this, (TextView) findViewById(C0966R.C0970id.l5_)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(aVar, layoutParams);
        return frameLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r0 = r0.getParent();
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo128671k(wg2.C102440a r12, com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider r13) {
        /*
            r11 = this;
            java.lang.String r0 = "navigator"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "configProvider"
            gy3.C87412m.m108594g(r13, r0)
            super.mo128671k(r12, r13)
            android.os.Bundle r12 = r13.f272912M
            r13 = 1
            if (r12 == 0) goto L_0x0151
            lh2.f0 r0 = r11.getPreviewPlugin()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r0 = r0.f327322d
            r1 = 0
            if (r0 == 0) goto L_0x0027
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0027
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.RelativeLayout"
            gy3.C87412m.m108592e(r0, r2)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout r2 = new com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout
            android.content.Context r3 = r11.getContext()
            java.lang.String r4 = "context"
            gy3.C87412m.m108593f(r3, r4)
            r2.<init>(r3)
            android.graphics.RectF r3 = r2.getVisibilityRect()
            java.lang.String r4 = "cropRect"
            android.os.Parcelable r4 = r12.getParcelable(r4)
            gy3.C87412m.m108591d(r4)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r3.set(r4)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r0.addView(r2, r3)
            com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$h r0 = com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout.C94436h.RECT_HARD
            r2.setStyle(r0)
            r2.bringToFront()
            java.lang.String r0 = "matrix"
            float[] r0 = r12.getFloatArray(r0)
            java.lang.String r2 = "offset"
            float[] r12 = r12.getFloatArray(r2)
            if (r12 != 0) goto L_0x0074
            r12 = 2
            float[] r12 = new float[r12]
        L_0x0074:
            r2 = 0
            r3 = r12[r2]
            r12 = r12[r13]
            if (r0 == 0) goto L_0x0151
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r4.setValues(r0)
            lh2.f0 r5 = r11.getPreviewPlugin()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r5 = r5.f327322d
            r6 = 3
            if (r5 != 0) goto L_0x008d
            goto L_0x00a0
        L_0x008d:
            r7 = r0[r2]
            r8 = r0[r6]
            float r7 = r7 * r7
            double r9 = (double) r7
            double r7 = (double) r8
            double r7 = r7 * r7
            double r9 = r9 + r7
            double r7 = java.lang.Math.sqrt(r9)
            float r7 = (float) r7
            r5.setScaleX(r7)
        L_0x00a0:
            lh2.f0 r5 = r11.getPreviewPlugin()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r5 = r5.f327322d
            if (r5 != 0) goto L_0x00a9
            goto L_0x00bc
        L_0x00a9:
            r2 = r0[r2]
            r0 = r0[r6]
            float r2 = r2 * r2
            double r6 = (double) r2
            double r8 = (double) r0
            double r8 = r8 * r8
            double r6 = r6 + r8
            double r6 = java.lang.Math.sqrt(r6)
            float r0 = (float) r6
            r5.setScaleY(r0)
        L_0x00bc:
            lh2.f0 r0 = r11.getPreviewPlugin()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r0 = r0.f327322d
            if (r0 != 0) goto L_0x00c5
            goto L_0x00c8
        L_0x00c5:
            r0.setTranslationX(r3)
        L_0x00c8:
            lh2.f0 r0 = r11.getPreviewPlugin()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r0 = r0.f327322d
            if (r0 != 0) goto L_0x00d1
            goto L_0x00d4
        L_0x00d1:
            r0.setTranslationY(r12)
        L_0x00d4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "translationX="
            r0.append(r2)
            lh2.f0 r2 = r11.getPreviewPlugin()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r2 = r2.f327322d
            if (r2 == 0) goto L_0x00f0
            float r2 = r2.getTranslationX()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x00f1
        L_0x00f0:
            r2 = r1
        L_0x00f1:
            r0.append(r2)
            java.lang.String r2 = " translationY="
            r0.append(r2)
            lh2.f0 r2 = r11.getPreviewPlugin()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r2 = r2.f327322d
            if (r2 == 0) goto L_0x010a
            float r2 = r2.getTranslationY()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x010b
        L_0x010a:
            r2 = r1
        L_0x010b:
            r0.append(r2)
            java.lang.String r2 = " scaleX="
            r0.append(r2)
            lh2.f0 r2 = r11.getPreviewPlugin()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r2 = r2.f327322d
            if (r2 == 0) goto L_0x0123
            float r1 = r2.getScaleX()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
        L_0x0123:
            r0.append(r1)
            java.lang.String r1 = " offsetX="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " offsetY="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = " matrix="
            r0.append(r12)
            r0.append(r4)
            java.lang.String r12 = r0.toString()
            java.lang.String r0 = "MicroMsg.EditorVideoPluginLayoutNew"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            android.graphics.Matrix r12 = new android.graphics.Matrix
            r12.<init>()
            r11.f270600E = r12
            r4.invert(r12)
        L_0x0151:
            mh2.a r12 = r11.getCropVideoPlugin()
            r12.f292731s = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.edit.FinderVideoEditPluginLayout.mo128671k(wg2.a, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        int i;
        C101198e.C101199b bVar2 = bVar;
        C87412m.m108594g(bVar2, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 60 || ordinal == 62) {
            String b = getBgPlugin().mo138859b();
            getPreviewPlugin().release();
            getItemContainerPlugin().onPause();
            getAddMusicPlugin().onPause();
            int i2 = 0;
            if (getMoreMenuPlugin().f224407j) {
                Pattern pattern = C61926c.f176038a;
                i = 1;
            } else {
                i = 0;
            }
            CaptureDataManager.f272890c.f272892b.putInt("key_extra_feature_flag", i);
            if (getMoreMenuPlugin().f224408n == 2) {
                CaptureDataManager.f272890c.f272892b.putString("key_group_list", getMoreMenuPlugin().mo106974a());
            } else if (getMoreMenuPlugin().f224408n == 3) {
                CaptureDataManager.f272890c.f272892b.putString("key_black_list", getMoreMenuPlugin().mo106974a());
            }
            C97882i iVar = new C97882i(getAddMusicPlugin().mo161620c(), getAddMusicPlugin().f329710j, getItemContainerPlugin().mo138890d(this.f270600E), getItemContainerPlugin().mo138889c(), getItemContainerPlugin().mo138888b(), getPreviewPlugin().f327330o, getPreviewPlugin().f327331p, new ArrayList(), b, getItemContainerPlugin().mo138888b());
            Log.m105924i("MicroMsg.EditorVideoPluginLayoutNew", "edit config: " + iVar);
            getReMuxPlugin().mo138878m(iVar);
            C110992d dVar = C110992d.f332425a;
            dVar.mo162677k("KEY_ADD_EMOJI_COUNT_INT", Integer.valueOf(getItemContainerPlugin().mo138891f()));
            dVar.mo162677k("KEY_ADD_TEXT_COUNT_INT", Integer.valueOf(getItemContainerPlugin().mo138892g()));
            dVar.mo162677k("KEY_SELECT_MUSIC_INT", Integer.valueOf(getAddMusicPlugin().f329710j == null ? 0 : 1));
            dVar.mo162677k("KEY_SELECT_ORIGIN_INT", Integer.valueOf(getAddMusicPlugin().mo161620c() ^ true ? 1 : 0));
            dVar.mo162677k("KEY_AFTER_EDIT_INT", 1);
            dVar.mo162672f();
            dVar.mo162670d(13);
            C110992d.f332428d.f310296i = System.currentTimeMillis();
            RecordConfigProvider configProvider = getConfigProvider();
            if (configProvider != null) {
                i2 = configProvider.f272905F;
            }
            dVar.mo162671e(i2);
            C108745d dVar2 = C108745d.f325633i;
            if (dVar2 != null) {
                dVar2.mo159768d();
                return;
            }
            return;
        }
        if (bVar2 != C101198e.C101199b.EDIT_CROP_VIDEO_PERCENT) {
            Log.m105920e("MicroMsg.EditorVideoPluginLayoutNew", "unknown status " + bVar2);
        }
        super.mo14585p(bVar, bundle);
    }
}
