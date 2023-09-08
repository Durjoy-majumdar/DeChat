package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.tencent.p014mm.modelstat.C92859v;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94893m;
import com.tencent.p014mm.plugin.sns.model.C94896n;
import com.tencent.p014mm.plugin.sns.model.C94921o2;
import com.tencent.p014mm.plugin.sns.p106ui.C96104o8;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import jp2.C98958h;
import jp2.C98963o;
import jp2.C98977w;
import jr2.C99016j;
import po2.C100833f;
import rq2.C63505q;
import sf0.C90188n0;
import te3.C101833r5;
import te3.bb4;
import te3.cb4;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.AdListView */
public class AdListView extends ListView {

    /* renamed from: d */
    public C98958h f276616d;

    /* renamed from: e */
    public C94896n f276617e;

    /* renamed from: f */
    public C94893m f276618f;

    /* renamed from: g */
    public HashSet<String> f276619g = new HashSet<>();

    /* renamed from: h */
    public int f276620h = -1;

    /* renamed from: i */
    public int f276621i = -1;

    /* renamed from: j */
    public int f276622j = -1;

    /* renamed from: n */
    public C95303a f276623n;

    /* renamed from: com.tencent.mm.plugin.sns.ui.AdListView$a */
    public interface C95303a {
    }

    public AdListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("attachViewToParent", "com.tencent.mm.plugin.sns.ui.AdListView");
        super.attachViewToParent(view, i, layoutParams);
        String str = "";
        if (view.getTag() != null && (view.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) {
            BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
            String str2 = baseViewHolder.f279948c + " " + baseViewHolder.f279956g;
            TimeLineObject timeLineObject = baseViewHolder.timeLineObject;
            boolean z = true;
            if (!(timeLineObject.sightFolded == 1 || timeLineObject.showFlag == 1)) {
                z = false;
            }
            SnsReportHelper.f275506m0.mo131384q(timeLineObject.f283893Id, z);
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            TimeLineObject timeLineObject2 = baseViewHolder.timeLineObject;
            String str3 = timeLineObject2.f283893Id;
            C101833r5 r5Var = timeLineObject2.AppInfo;
            if (r5Var != null) {
                str = r5Var.f299236d;
            }
            snsReportHelper.mo131385r(str3, str);
            SnsReportHelper.f275506m0.mo131386s(baseViewHolder.f279952e);
            C98958h hVar = this.f276616d;
            if (hVar != null && baseViewHolder.isAd) {
                ((C98963o) hVar).mo138311r(baseViewHolder.f279948c, baseViewHolder.f279956g, baseViewHolder.f279954f, view, baseViewHolder.f279952e, baseViewHolder.snsobj, baseViewHolder.f279946b, 1);
            }
            if (!this.f276619g.contains(baseViewHolder.f279950d) && ((baseViewHolder.isAd && baseViewHolder.timeLineObject.ContentObj.f298424e == 15) || baseViewHolder.timeLineObject.ContentObj.f298424e == 18)) {
                C98977w.m128887c(C94866e1.Yx0().mo139807TE(baseViewHolder.f279950d), false, false, 0);
                this.f276619g.add(baseViewHolder.f279950d);
            }
            C94896n nVar = this.f276617e;
            if (nVar != null) {
                ((C94921o2) nVar).mo131181c(baseViewHolder.f279948c, baseViewHolder.f279956g, baseViewHolder.timeLineObject);
            }
            C94893m mVar = this.f276618f;
            if (mVar != null) {
                mVar.mo131074b(baseViewHolder.f279948c, baseViewHolder.f279956g, baseViewHolder.f279952e, baseViewHolder.timeLineObject, baseViewHolder.isAd, baseViewHolder.f279992y);
            }
            SnsMethodCalculate.markStartTimeMs("updateUnreadTipFaultRange", "com.tencent.mm.plugin.sns.ui.AdListView");
            C94866e1.fy0().mo131302c(baseViewHolder.f279952e);
            SnsMethodCalculate.markEndTimeMs("updateUnreadTipFaultRange", "com.tencent.mm.plugin.sns.ui.AdListView");
            str = str2;
        }
        if (C90188n0.f258912F) {
            Log.m105918d("MicroMsg.AdListView", "3childview  onAdded " + str + " count:" + getChildCount());
        }
        SnsMethodCalculate.markEndTimeMs("attachViewToParent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public void detachViewFromParent(View view) {
        String str;
        SnsMethodCalculate.markStartTimeMs("detachViewFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
        if (view.getTag() == null || !(view.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) {
            str = "";
        } else {
            BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
            str = baseViewHolder.f279948c + " " + baseViewHolder.f279956g;
        }
        if (C90188n0.f258912F) {
            Log.m105918d("MicroMsg.AdListView", "1childview  onRemoved " + str + " count:" + getChildCount());
        }
        super.detachViewFromParent(view);
        SnsMethodCalculate.markEndTimeMs("detachViewFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public void detachViewsFromParent(int i, int i2) {
        String str;
        SnsMethodCalculate.markStartTimeMs("detachViewsFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
        for (int i3 = i; i3 < i + i2; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getTag() == null || !(childAt.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) {
                str = "";
            } else {
                BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) childAt.getTag();
                C98958h hVar = this.f276616d;
                if (hVar != null && baseViewHolder.isAd) {
                    ((C98963o) hVar).mo138312s(baseViewHolder.f279948c, baseViewHolder.f279956g, baseViewHolder.f279952e, 1);
                }
                C94896n nVar = this.f276617e;
                if (nVar != null) {
                    ((C94921o2) nVar).mo131182d(baseViewHolder.f279948c, baseViewHolder.f279956g, baseViewHolder.timeLineObject);
                }
                C94893m mVar = this.f276618f;
                if (mVar != null) {
                    mVar.mo131073a(baseViewHolder.f279948c, baseViewHolder.f279956g, baseViewHolder.f279952e, baseViewHolder.timeLineObject, baseViewHolder.isAd);
                }
                str = baseViewHolder.f279948c + " " + baseViewHolder.f279956g;
            }
            if (C90188n0.f258912F) {
                Log.m105918d("MicroMsg.AdListView", "8removeView  detachViewsFromParent " + str + " count:" + getChildCount());
            }
        }
        super.detachViewsFromParent(i, i2);
        SnsMethodCalculate.markEndTimeMs("detachViewsFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        String str;
        boolean z;
        String str2 = "dispatchTouchEvent";
        SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.ui.AdListView");
        C95303a aVar = this.f276623n;
        if (aVar != null) {
            SnsTimeLineUI$$i0 snsTimeLineUI$$i0 = (SnsTimeLineUI$$i0) aVar;
            snsTimeLineUI$$i0.getClass();
            SnsMethodCalculate.markStartTimeMs("onDispatchTouch", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$53");
            SnsTimeLineBaseAdapter g = SnsTimeLineUI.m122282J7(snsTimeLineUI$$i0.f278757c).mo137288g();
            if (g.f278568b.mo132094p()) {
                char c = 0;
                if (motionEvent.getAction() == 0) {
                    SnsTimeLineUI.m122284L7(snsTimeLineUI$$i0.f278757c).mo132087i();
                    SnsTimeLineUI.m122284L7(snsTimeLineUI$$i0.f278757c).f276710t.mo133679d();
                    snsTimeLineUI$$i0.f278755a[0] = motionEvent.getX();
                    snsTimeLineUI$$i0.f278756b[0] = motionEvent.getY();
                }
                char c2 = 1;
                if (motionEvent.getAction() == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    Log.m105924i("MicroMsg.SnsTimeLineUI", "AdListView onDispatchTouch ACTION_UP success : xUp = " + x + ", yUp = " + y + ", , xDown = " + snsTimeLineUI$$i0.f278755a[0] + ", yDown = " + snsTimeLineUI$$i0.f278756b[0]);
                    float abs = Math.abs(x - snsTimeLineUI$$i0.f278755a[0]);
                    float abs2 = Math.abs(y - snsTimeLineUI$$i0.f278756b[0]);
                    boolean z2 = abs > 50.0f || abs2 > 50.0f;
                    Log.m105924i("MicroMsg.SnsTimeLineUI", "AdListView onDispatchTouch ACTION_UP success : xDelta = " + abs + ", yDelta = " + abs2);
                    if (z2) {
                        snsTimeLineUI$$i0.f278757c.mo132950a1();
                        SnsTimeLineUI.m122285M7(snsTimeLineUI$$i0.f278757c).mo133010d();
                    } else {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        SnsMethodCalculate.markStartTimeMs("isTouchInIgnoreView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        int i = 0;
                        while (true) {
                            if (i >= ((ArrayList) g.f278566R).size()) {
                                str = str2;
                                SnsMethodCalculate.markEndTimeMs("isTouchInIgnoreView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                z = false;
                                break;
                            }
                            View view = (View) ((ArrayList) g.f278566R).get(i);
                            if (view != null) {
                                int[] iArr = new int[2];
                                view.getLocationOnScreen(iArr);
                                int i2 = iArr[c];
                                int i3 = iArr[c2];
                                int measuredWidth = view.getMeasuredWidth() + i2;
                                int measuredHeight = view.getMeasuredHeight() + i3;
                                StringBuilder sb = new StringBuilder();
                                str = str2;
                                sb.append("[isTouchInIgnoreView] left = ");
                                sb.append(i2);
                                sb.append(", top = ");
                                sb.append(i3);
                                sb.append(", right = ");
                                sb.append(measuredWidth);
                                sb.append(", bottom = ");
                                sb.append(measuredHeight);
                                sb.append(", x = ");
                                sb.append(rawX);
                                sb.append(", y =");
                                sb.append(rawY);
                                Log.m105924i("MicroMsg.SnsTimeLineBaseAdapter", sb.toString());
                                if (rawY >= ((float) i3) && rawY <= ((float) measuredHeight) && rawX >= ((float) i2) && rawX <= ((float) measuredWidth)) {
                                    SnsMethodCalculate.markEndTimeMs("isTouchInIgnoreView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                    z = true;
                                    break;
                                }
                            } else {
                                str = str2;
                            }
                            i++;
                            str2 = str;
                            c = 0;
                            c2 = 1;
                        }
                        if (!z) {
                            Log.m105924i("MicroMsg.SnsTimeLineUI", "AdListView onDispatchTouch success remove commentView & hideCommentFooter");
                            C96104o8 h4 = g.f278568b.mo67326h4();
                            h4.getClass();
                            SnsMethodCalculate.markStartTimeMs("removeCommentViewWithAnimation", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
                            SnsCommentShowAbLayout snsCommentShowAbLayout = h4.f280690e;
                            if (snsCommentShowAbLayout != null) {
                                h4.mo133670c(((C96104o8.C96106c) snsCommentShowAbLayout.getTag()).f280697b);
                            }
                            SnsMethodCalculate.markEndTimeMs("removeCommentViewWithAnimation", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
                            BaseTimeLine baseTimeLine = g.f278568b;
                            baseTimeLine.getClass();
                            SnsMethodCalculate.markStartTimeMs("hideCommentFooter", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                            if (baseTimeLine.f276708r.getVisibility() != 8) {
                                baseTimeLine.f276708r.setVisibility(8);
                            }
                            SnsMethodCalculate.markEndTimeMs("hideCommentFooter", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                        }
                        SnsMethodCalculate.markEndTimeMs("onDispatchTouch", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$53");
                    }
                }
            }
            str = str2;
            SnsMethodCalculate.markEndTimeMs("onDispatchTouch", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$53");
        } else {
            str = str2;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.AdListView");
        return dispatchTouchEvent;
    }

    public void layoutChildren() {
        SnsMethodCalculate.markStartTimeMs("layoutChildren", "com.tencent.mm.plugin.sns.ui.AdListView");
        super.layoutChildren();
        SnsMethodCalculate.markEndTimeMs("layoutChildren", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        if (r3 != 2) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "onInterceptTouchEvent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.AdListView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = super.onInterceptTouchEvent(r7)
            int r3 = r6.f276622j
            if (r3 >= 0) goto L_0x001e
            android.content.Context r3 = r6.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            r6.f276622j = r3
        L_0x001e:
            int r3 = r7.getActionMasked()
            float r4 = r7.getX()
            int r4 = (int) r4
            float r7 = r7.getY()
            int r7 = (int) r7
            r5 = 2
            if (r3 == 0) goto L_0x0032
            if (r3 == r5) goto L_0x0036
            goto L_0x004f
        L_0x0032:
            r6.f276621i = r4
            r6.f276620h = r7
        L_0x0036:
            int r3 = r6.f276621i
            int r4 = r4 - r3
            int r3 = java.lang.Math.abs(r4)
            int r4 = r6.f276620h
            int r7 = r7 - r4
            int r7 = java.lang.Math.abs(r7)
            if (r2 == 0) goto L_0x004f
            if (r3 <= r7) goto L_0x004f
            int r3 = r6.f276622j
            int r3 = r3 * 2
            if (r7 >= r3) goto L_0x004f
            r2 = 0
        L_0x004f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.AdListView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.AdListView");
        super.onLayout(z, i, i2, i3, i4);
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public void onViewAdded(View view) {
        SnsMethodCalculate.markStartTimeMs("onViewAdded", "com.tencent.mm.plugin.sns.ui.AdListView");
        String str = "";
        if (view.getTag() != null && (view.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) {
            BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
            String str2 = baseViewHolder.f279948c + " " + baseViewHolder.f279956g;
            TimeLineObject timeLineObject = baseViewHolder.timeLineObject;
            boolean z = true;
            if (!(timeLineObject.sightFolded == 1 || timeLineObject.showFlag == 1)) {
                z = false;
            }
            SnsReportHelper.f275506m0.mo131384q(timeLineObject.f283893Id, z);
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            TimeLineObject timeLineObject2 = baseViewHolder.timeLineObject;
            String str3 = timeLineObject2.f283893Id;
            C101833r5 r5Var = timeLineObject2.AppInfo;
            if (r5Var != null) {
                str = r5Var.f299236d;
            }
            snsReportHelper.mo131385r(str3, str);
            SnsReportHelper.f275506m0.mo131386s(baseViewHolder.f279952e);
            C98958h hVar = this.f276616d;
            if (hVar != null && baseViewHolder.isAd) {
                ((C98963o) hVar).mo138311r(baseViewHolder.f279948c, baseViewHolder.f279956g, baseViewHolder.f279954f, view, baseViewHolder.f279952e, baseViewHolder.snsobj, baseViewHolder.f279946b, 1);
            }
            if (!this.f276619g.contains(baseViewHolder.f279950d) && ((baseViewHolder.isAd && baseViewHolder.timeLineObject.ContentObj.f298424e == 15) || baseViewHolder.timeLineObject.ContentObj.f298424e == 18)) {
                C98977w.m128887c(C94866e1.Yx0().mo139807TE(baseViewHolder.f279950d), false, false, 0);
                this.f276619g.add(baseViewHolder.f279950d);
            }
            C94896n nVar = this.f276617e;
            if (nVar != null) {
                ((C94921o2) nVar).mo131181c(baseViewHolder.f279948c, baseViewHolder.f279956g, baseViewHolder.timeLineObject);
            }
            C94893m mVar = this.f276618f;
            if (mVar != null) {
                mVar.mo131074b(baseViewHolder.f279948c, baseViewHolder.f279956g, baseViewHolder.f279952e, baseViewHolder.timeLineObject, baseViewHolder.isAd, baseViewHolder.f279992y);
            }
            SnsMethodCalculate.markStartTimeMs("updateUnreadTipFaultRange", "com.tencent.mm.plugin.sns.ui.AdListView");
            C94866e1.fy0().mo131302c(baseViewHolder.f279952e);
            SnsMethodCalculate.markEndTimeMs("updateUnreadTipFaultRange", "com.tencent.mm.plugin.sns.ui.AdListView");
            str = str2;
        }
        if (C90188n0.f258912F) {
            Log.m105918d("MicroMsg.AdListView", "4childview  onViewAdded " + str + " count:" + getChildCount());
        }
        SnsMethodCalculate.markEndTimeMs("onViewAdded", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public void onViewRemoved(View view) {
        int i;
        SnsMethodCalculate.markStartTimeMs("onViewRemoved", "com.tencent.mm.plugin.sns.ui.AdListView");
        String str = "";
        if (view.getTag() != null && (view.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) {
            BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
            String str2 = baseViewHolder.f279948c + " " + baseViewHolder.f279956g;
            C98958h hVar = this.f276616d;
            if (hVar != null && baseViewHolder.isAd) {
                ((C98963o) hVar).mo138312s(baseViewHolder.f279948c, baseViewHolder.f279956g, baseViewHolder.f279952e, 1);
            }
            C94896n nVar = this.f276617e;
            if (nVar != null) {
                ((C94921o2) nVar).mo131182d(baseViewHolder.f279948c, baseViewHolder.f279956g, baseViewHolder.timeLineObject);
            }
            C94893m mVar = this.f276618f;
            if (mVar != null) {
                mVar.mo131073a(baseViewHolder.f279948c, baseViewHolder.f279956g, baseViewHolder.f279952e, baseViewHolder.timeLineObject, baseViewHolder.isAd);
            }
            if (baseViewHolder.timeLineObject.ContentObj.f298424e == 3) {
                SnsInfo TE = C94866e1.Yx0().mo139807TE(baseViewHolder.f279950d);
                int adRecSrc = TE == null ? 0 : TE.getAdRecSrc();
                String str3 = baseViewHolder.timeLineObject.statExtStr;
                String q0 = C102236a0.m134765q0(baseViewHolder.f279952e);
                SnsMethodCalculate.markStartTimeMs("statisticsExtInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
                try {
                    bb4 h = C92859v.m117130h(str3);
                    if (h == null || h.f226992d == null) {
                        Log.m105920e("MicroMsg.SnsStatExtUtil", "statisticsExtInfo for timeline, extInfo or extInfo.StatSnsAdInfo==null");
                        SnsMethodCalculate.markEndTimeMs("statisticsExtInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
                    } else {
                        if (TE != null) {
                            try {
                                i = C92859v.m117126d(TE.getTimeLine().canvasInfo);
                            } catch (Throwable unused) {
                            }
                            Log.m105924i("MicroMsg.SnsStatExtUtil", "report adPageExposure(13235) for timeline: scene=" + 3 + ", adCanvasType=" + i + ", srcSnsId=" + h.f226992d.f298023e + ", uxinfo=" + h.f226992d.f298024f + ", statExtStr=" + str3);
                            cb4 cb4 = h.f226992d;
                            ((C99016j) C86312j.m106911c(C99016j.class)).mo55732rh(13235, adRecSrc, "3", cb4.f298023e, cb4.f298024f, str, q0, Integer.valueOf(i));
                            C100833f fVar = new C100833f();
                            cb4 cb42 = h.f226992d;
                            fVar.f295341a = cb42.f298023e;
                            fVar.f295342b = cb42.f298024f;
                            fVar.f295343c = 1;
                            fVar.f295344d = 3;
                            fVar.f295345e = i;
                            C63505q.m74843b(fVar);
                            SnsMethodCalculate.markEndTimeMs("statisticsExtInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
                        }
                        i = 0;
                        Log.m105924i("MicroMsg.SnsStatExtUtil", "report adPageExposure(13235) for timeline: scene=" + 3 + ", adCanvasType=" + i + ", srcSnsId=" + h.f226992d.f298023e + ", uxinfo=" + h.f226992d.f298024f + ", statExtStr=" + str3);
                        cb4 cb43 = h.f226992d;
                        ((C99016j) C86312j.m106911c(C99016j.class)).mo55732rh(13235, adRecSrc, "3", cb43.f298023e, cb43.f298024f, str, q0, Integer.valueOf(i));
                        C100833f fVar2 = new C100833f();
                        cb4 cb422 = h.f226992d;
                        fVar2.f295341a = cb422.f298023e;
                        fVar2.f295342b = cb422.f298024f;
                        fVar2.f295343c = 1;
                        fVar2.f295344d = 3;
                        fVar2.f295345e = i;
                        C63505q.m74843b(fVar2);
                        SnsMethodCalculate.markEndTimeMs("statisticsExtInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
                    }
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.SnsStatExtUtil", "statisticsExtInfo for timeline, exp=" + th.toString());
                }
            }
            str = str2;
        }
        if (C90188n0.f258912F) {
            Log.m105918d("MicroMsg.AdListView", "5childview  onViewRemoved " + str + " count:" + getChildCount());
        }
        SnsMethodCalculate.markEndTimeMs("onViewRemoved", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public void removeView(View view) {
        String str;
        SnsMethodCalculate.markStartTimeMs("removeView", "com.tencent.mm.plugin.sns.ui.AdListView");
        super.removeView(view);
        if (view.getTag() == null || !(view.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) {
            str = "";
        } else {
            BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
            str = baseViewHolder.f279948c + " " + baseViewHolder.f279956g;
        }
        if (C90188n0.f258912F) {
            Log.m105918d("MicroMsg.AdListView", "7removeView  onViewRemoved " + str + " count:" + getChildCount());
        }
        SnsMethodCalculate.markEndTimeMs("removeView", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public void removeViewInLayout(View view) {
        String str;
        SnsMethodCalculate.markStartTimeMs("removeViewInLayout", "com.tencent.mm.plugin.sns.ui.AdListView");
        if (view.getTag() == null || !(view.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) {
            str = "";
        } else {
            BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
            str = baseViewHolder.f279948c + " " + baseViewHolder.f279956g;
        }
        if (C90188n0.f258912F) {
            Log.m105918d("MicroMsg.AdListView", "6removeViewInLayout  onViewRemoved " + str + " count:" + getChildCount());
        }
        super.removeViewInLayout(view);
        SnsMethodCalculate.markEndTimeMs("removeViewInLayout", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public void setOnDispatchTouchListener(C95303a aVar) {
        SnsMethodCalculate.markStartTimeMs("setOnDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.AdListView");
        this.f276623n = aVar;
        SnsMethodCalculate.markEndTimeMs("setOnDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public void setTimelineEvent(C94893m mVar) {
        SnsMethodCalculate.markStartTimeMs("setTimelineEvent", "com.tencent.mm.plugin.sns.ui.AdListView");
        this.f276618f = mVar;
        SnsMethodCalculate.markEndTimeMs("setTimelineEvent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public void setTimelineStat(C94896n nVar) {
        SnsMethodCalculate.markStartTimeMs("setTimelineStat", "com.tencent.mm.plugin.sns.ui.AdListView");
        this.f276617e = nVar;
        SnsMethodCalculate.markEndTimeMs("setTimelineStat", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public AdListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void detachViewFromParent(int i) {
        SnsMethodCalculate.markStartTimeMs("detachViewFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
        if (C90188n0.f258912F) {
            Log.m105918d("MicroMsg.AdListView", "2childview  onRemoved " + i + " count:" + getChildCount());
        }
        super.detachViewFromParent(i);
        SnsMethodCalculate.markEndTimeMs("detachViewFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }
}
