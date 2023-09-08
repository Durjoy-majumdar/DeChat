package x82;

import a92.C0018e;
import a92.C103341b;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.projector.recyclerview.ScreenThumbLayoutManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import com.tencent.xweb.XFileSdk;
import com.tencent.xweb.file.XVFSFile;
import cq3.C106958d;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import t82.C110949e;
import t82.C110952f;
import x82.C112075a;
import zp3.C112659d0;

/* renamed from: x82.i */
public final class C112098i implements XFileSdk.ActionCallback {

    /* renamed from: a */
    public final /* synthetic */ C112101k f335616a;

    /* renamed from: x82.i$a */
    public static final class C112099a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112101k f335617d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112099a(C112101k kVar) {
            super(0);
            this.f335617d = kVar;
        }

        public Object invoke() {
            this.f335617d.setLockGenerateBitmap(false);
            return C13598b0.f38549a;
        }
    }

    public C112098i(C112101k kVar) {
        this.f335616a = kVar;
    }

    public void onDoubleTap(MotionEvent motionEvent) {
    }

    public void onGeneralCallback(String str, HashMap<String, Object> hashMap) {
    }

    public void onPageChange(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        Log.m105924i("MicroMsg.ScreenFileProjector", "xfile onPageChange " + i4 + " and pageWidth " + i5 + " and pageHeight " + i6);
        C112101k kVar = this.f335616a;
        int i7 = kVar.f335628Q;
        if (i4 > i7 && i7 != -1) {
            kVar.mo163878i();
            Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markScrollFlipPage");
            C115669n.INSTANCE.mo175913w(1538, 12, 1);
            C112075a.C112076a.m152803a(this.f335616a, C112075a.C112077b.SLIDE_CONTENT_LEFT, (Bundle) null, 2, (Object) null);
        } else if (i4 < i7 && i7 != -1) {
            kVar.mo163878i();
            Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markScrollFlipPage");
            C115669n.INSTANCE.mo175913w(1538, 12, 1);
            C112075a.C112076a.m152803a(this.f335616a, C112075a.C112077b.SLIDE_CONTENT_RIGHT, (Bundle) null, 2, (Object) null);
        }
        C112101k kVar2 = this.f335616a;
        if (!kVar2.f335624L) {
            kVar2.f335624L = true;
            C112080b0 thumbUiLayout = kVar2.getThumbUiLayout();
            if (thumbUiLayout != null) {
                thumbUiLayout.mo163780b();
            }
        }
        this.f335616a.setMCurrentIndex(i4);
        this.f335616a.setMCurrentScale(1.0f);
        this.f335616a.setMCurrentPageWidth(i5);
        this.f335616a.setMCurrentPageHeight(i6);
        C112080b0 thumbUiLayout2 = this.f335616a.getThumbUiLayout();
        if (thumbUiLayout2 != null) {
            int mCurrentPageWidth = this.f335616a.getMCurrentPageWidth();
            int mCurrentPageHeight = this.f335616a.getMCurrentPageHeight();
            C103341b bVar = thumbUiLayout2.f335551g;
            if (bVar != null) {
                bVar.f304732i = i4;
                float f = (float) mCurrentPageWidth;
                float f2 = (float) mCurrentPageHeight;
                float f3 = f / f2;
                float f4 = C103341b.f304723q;
                float f5 = f2 / (f / f4);
                float f6 = C103341b.f304724r;
                if (f5 > f6) {
                    float f7 = f / (f2 / f6);
                    if (f7 > f4) {
                        float f8 = C103341b.f304725s;
                        float f9 = f8 / f3;
                        if (f9 <= f6) {
                            f6 = f9;
                        }
                        bVar.f304734n = f6;
                        bVar.f304733j = f8;
                    } else {
                        float f15 = C103341b.f304725s;
                        if (f7 < f15) {
                            bVar.f304734n = f5;
                            bVar.f304733j = f15;
                        } else {
                            bVar.f304734n = f6;
                            bVar.f304733j = f7;
                        }
                    }
                } else {
                    bVar.f304734n = f5;
                    bVar.f304733j = f4;
                }
                if (!(bVar.f304730g == -1 || bVar.f304731h == -1)) {
                    bVar.notifyItemChanged(i4);
                }
            }
            RecyclerView recyclerView = thumbUiLayout2.f335552h;
            if (recyclerView != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "applyCurrentThumbnail", "(III)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "applyCurrentThumbnail", "(III)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
        C112101k kVar3 = this.f335616a;
        kVar3.setMCurrentViewStatus(XFileSdk.getViewStatus(kVar3.f335625M, kVar3.f335626N));
        if (i5 > 0 && i6 > 0 && this.f335616a.getMCurrentViewStatus() != null) {
            C112079b multiTalkStrokeContext = this.f335616a.getMultiTalkStrokeContext();
            if (multiTalkStrokeContext != null) {
                multiTalkStrokeContext.f335536f = this.f335616a.getMCurrentPageHeight();
            }
            C112079b multiTalkStrokeContext2 = this.f335616a.getMultiTalkStrokeContext();
            if (multiTalkStrokeContext2 != null) {
                multiTalkStrokeContext2.f335535e = this.f335616a.getMCurrentPageWidth();
            }
            C112079b multiTalkStrokeContext3 = this.f335616a.getMultiTalkStrokeContext();
            if (multiTalkStrokeContext3 != null) {
                XFileSdk.ViewStatus mCurrentViewStatus = this.f335616a.getMCurrentViewStatus();
                C87412m.m108591d(mCurrentViewStatus);
                int i8 = mCurrentViewStatus.transX;
                XFileSdk.ViewStatus mCurrentViewStatus2 = this.f335616a.getMCurrentViewStatus();
                C87412m.m108591d(mCurrentViewStatus2);
                multiTalkStrokeContext3.mo163778c(1.0f, i8, mCurrentViewStatus2.transY, false, false);
            }
            C98324b bVar2 = new C98324b((String) null, (String) null, false, 0, 0, (String) null, (String) null, 0, 0, (String) null, (ArrayList) null, (ArrayList) null, false, (Bundle) null, (Rect) null, 0, 65535, (C8480h) null);
            XFileSdk.ViewStatus mCurrentViewStatus3 = this.f335616a.getMCurrentViewStatus();
            C87412m.m108591d(mCurrentViewStatus3);
            int i9 = mCurrentViewStatus3.transX;
            XFileSdk.ViewStatus mCurrentViewStatus4 = this.f335616a.getMCurrentViewStatus();
            C87412m.m108591d(mCurrentViewStatus4);
            int i15 = mCurrentViewStatus4.transY;
            int mCurrentPageWidth2 = this.f335616a.getMCurrentPageWidth();
            XFileSdk.ViewStatus mCurrentViewStatus5 = this.f335616a.getMCurrentViewStatus();
            C87412m.m108591d(mCurrentViewStatus5);
            int i16 = mCurrentPageWidth2 + mCurrentViewStatus5.transX;
            int mCurrentPageHeight2 = this.f335616a.getMCurrentPageHeight();
            XFileSdk.ViewStatus mCurrentViewStatus6 = this.f335616a.getMCurrentViewStatus();
            C87412m.m108591d(mCurrentViewStatus6);
            bVar2.f288194o = new Rect(i9, i15, i16, mCurrentPageHeight2 + mCurrentViewStatus6.transY);
            C112079b multiTalkStrokeContext4 = this.f335616a.getMultiTalkStrokeContext();
            if (multiTalkStrokeContext4 != null) {
                multiTalkStrokeContext4.mo163777b(bVar2, new C112099a(this.f335616a));
            }
            this.f335616a.mo163882r(true);
            C112080b0 thumbUiLayout3 = this.f335616a.getThumbUiLayout();
            if (thumbUiLayout3 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f335616a.f335628Q + 1);
                sb.append(XVFSFile.SEPARATOR_CHAR);
                sb.append(this.f335616a.f335623K);
                String sb4 = sb.toString();
                C87412m.m108594g(sb4, "str");
                FrameLayout frameLayout = thumbUiLayout3.f335555k;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                thumbUiLayout3.f335559o = sb4;
                C112134y yVar = thumbUiLayout3.f335554j;
                if (yVar != null) {
                    yVar.mo163918e(sb4);
                }
            }
        }
    }

    public void onPageCountUpdate(int i) {
        Log.m105924i("MicroMsg.ScreenFileProjector", "xfile onPageCountUpdate " + i);
        this.f335616a.setMMaxCount(i);
        C112096g0 mScreenReportData = this.f335616a.getMScreenReportData();
        if (mScreenReportData != null) {
            mScreenReportData.f335605a = this.f335616a.f335623K;
        }
        C112080b0 thumbUiLayout = this.f335616a.getThumbUiLayout();
        if (thumbUiLayout != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f335616a.f335628Q + 1);
            sb.append(XVFSFile.SEPARATOR_CHAR);
            sb.append(i);
            String sb4 = sb.toString();
            C87412m.m108594g(sb4, "str");
            FrameLayout frameLayout = thumbUiLayout.f335555k;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            thumbUiLayout.f335559o = sb4;
            C112134y yVar = thumbUiLayout.f335554j;
            if (yVar != null) {
                yVar.mo163918e(sb4);
            }
        }
    }

    public void onReachEnd() {
    }

    public void onSingleTap(MotionEvent motionEvent) {
        C112075a.C112076a.m152803a(this.f335616a, C112075a.C112077b.SCREEN_ON_CLICK, (Bundle) null, 2, (Object) null);
    }

    public void onThumbnailLoad(int i, Bitmap bitmap) {
        C87412m.m108594g(bitmap, AssetExtension.SCENE_THUMBNAIL);
        Log.m105924i("MicroMsg.ScreenFileProjector", "xfile onThumbnailLoad " + i);
        C112080b0 thumbUiLayout = this.f335616a.getThumbUiLayout();
        if (thumbUiLayout != null) {
            if (thumbUiLayout.f335547c.size() <= i) {
                thumbUiLayout.f335547c.add(bitmap);
            } else {
                thumbUiLayout.f335547c.set(i, bitmap);
            }
            C103341b bVar = thumbUiLayout.f335551g;
            if (bVar != null) {
                bVar.f304730g = bitmap.getWidth();
                bVar.f304731h = bitmap.getHeight();
            }
            C0018e eVar = thumbUiLayout.f335550f;
            if (eVar != null) {
                C103341b bVar2 = thumbUiLayout.f335551g;
                int i2 = bVar2 != null ? (int) bVar2.f304733j : 0;
                FrameLayout frameLayout = thumbUiLayout.f335553i;
                if (frameLayout != null) {
                    frameLayout.getMeasuredWidth();
                }
                eVar.f20e = i2;
            }
            ScreenThumbLayoutManager screenThumbLayoutManager = thumbUiLayout.f335549e;
            if (screenThumbLayoutManager != null) {
                C103341b bVar3 = thumbUiLayout.f335551g;
                int i3 = bVar3 != null ? (int) bVar3.f304733j : 0;
                FrameLayout frameLayout2 = thumbUiLayout.f335553i;
                screenThumbLayoutManager.f162953w = frameLayout2 != null ? frameLayout2.getMeasuredWidth() : 0;
                screenThumbLayoutManager.f162952v = i3;
            }
            if (i == (thumbUiLayout.f335562r + 1) * 10 || i == thumbUiLayout.f335558n - 1) {
                thumbUiLayout.f335560p = false;
                C103341b bVar4 = thumbUiLayout.f335551g;
                if (bVar4 != null) {
                    CopyOnWriteArrayList<Bitmap> copyOnWriteArrayList = thumbUiLayout.f335547c;
                    C87412m.m108594g(copyOnWriteArrayList, "bitmapList");
                    CopyOnWriteArrayList<Bitmap> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    Iterator<Bitmap> it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        Bitmap next = it.next();
                        if (next != null) {
                            copyOnWriteArrayList2.add(next);
                        }
                    }
                    bVar4.f304729f = copyOnWriteArrayList2;
                    bVar4.notifyDataSetChanged();
                }
                if (thumbUiLayout.f335562r != thumbUiLayout.f335563s - 1) {
                    C103341b bVar5 = thumbUiLayout.f335551g;
                    if (bVar5 != null) {
                        Bitmap createBitmap = BitmapUtil.createBitmap((int) bVar5.f304733j, (int) bVar5.f304734n, Bitmap.Config.ARGB_8888);
                        C87412m.m108593f(createBitmap, "createBitmap(mCurrentWid…,Bitmap.Config.ARGB_8888)");
                        bVar5.f304729f.add(createBitmap);
                        bVar5.notifyItemInserted(bVar5.f304729f.size() - 1);
                        return;
                    }
                    return;
                }
                thumbUiLayout.f335561q = true;
            }
        }
    }

    public void onUserCancel() {
        Log.m105924i("MicroMsg.ScreenFileProjector", "xfile on user cancel finish");
        C105851w0.zx0().mo150664h();
    }

    public void onUserOperated() {
    }

    public void onViewStatusChange(int i, float f, int i2, int i3, int i4, int i5) {
        C110952f fVar;
        C110949e eVar;
        C112659d0 d0Var;
        C106958d dVar;
        Log.m105924i("MicroMsg.ScreenFileProjector", "xfile onViewStatusChange " + i + " and pageWidth " + i2 + " and pageHeight " + i3 + " and scale " + f + " and transX " + i4 + " and " + i5);
        C112079b multiTalkStrokeContext = this.f335616a.getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null && (fVar = multiTalkStrokeContext.f335542l) != null && (eVar = fVar.f331863o) != null && (d0Var = eVar.f331848j) != null && (dVar = (C106958d) d0Var.getBaseBoardView()) != null) {
            Matrix matrix = new Matrix();
            float f2 = f * dVar.f320171H;
            matrix.postScale(f2, f2, 0.0f, 0.0f);
            matrix.postTranslate((float) i4, (float) i5);
            dVar.f320134g = matrix;
            dVar.invalidate();
        }
    }
}
