package il1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C7777a0;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import nj3.C76912y0;
import p140cw.C7138g;
import r60.C101350i;
import rx3.C13598b0;
import xk1.C66297d2;

/* renamed from: il1.i */
public final class C60432i implements CaptureDataManager.C94403b {

    /* renamed from: d */
    public final Activity f172307d;

    /* renamed from: e */
    public final ImageView f172308e;

    /* renamed from: f */
    public final View f172309f;

    /* renamed from: g */
    public final C66297d2.C15724d f172310g;

    /* renamed from: h */
    public final String f172311h = "Finder.FinderLivePostCoverWidget";

    /* renamed from: i */
    public String f172312i = "";

    /* renamed from: j */
    public String f172313j = "";

    /* renamed from: n */
    public FinderMedia f172314n;

    /* renamed from: o */
    public final int f172315o = 10010;

    /* renamed from: p */
    public final C7777a0 f172316p;

    /* renamed from: il1.i$a */
    public static final class C60433a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60432i f172317d;

        public C60433a(C60432i iVar) {
            this.f172317d = iVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderGameLivePostCoverWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60432i iVar = this.f172317d;
            iVar.getClass();
            if (!C86709a0.m107535s().mo121147n()) {
                C76912y0.m92772k(iVar.f172307d);
            } else {
                ((C7138g) C86312j.m106911c(C7138g.class)).mo8311H7(iVar.f172307d, iVar.f172315o, 1, 28, (Intent) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderGameLivePostCoverWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.i$b */
    public static final class C60434b extends C87413o implements C32227p<C101350i<?>, Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60432i f172318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60434b(C60432i iVar) {
            super(2);
            this.f172318d = iVar;
        }

        public Object invoke(Object obj, Object obj2) {
            Bitmap bitmap = (Bitmap) obj2;
            C87412m.m108594g((C101350i) obj, "<anonymous parameter 0>");
            String str = this.f172318d.f172311h;
            Log.m105924i(str, "setCover: onTaskEnd, resource:" + bitmap);
            if (bitmap != null) {
                C60432i iVar = this.f172318d;
                FinderMedia finderMedia = new FinderMedia();
                String str2 = iVar.f172313j;
                finderMedia.url = str2;
                finderMedia.mediaType = 9;
                finderMedia.thumbUrl = str2;
                finderMedia.videoDuration = 0;
                finderMedia.width = (float) bitmap.getWidth();
                finderMedia.height = (float) bitmap.getHeight();
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    String mD5String = MD5Util.getMD5String(byteArrayOutputStream.toByteArray());
                    if (mD5String == null) {
                        mD5String = "";
                    }
                    finderMedia.md5sum = mD5String;
                } catch (Throwable unused) {
                    finderMedia.md5sum = "";
                }
                finderMedia.coverUrl = iVar.f172313j;
                iVar.f172314n = finderMedia;
            }
            return C13598b0.f38549a;
        }
    }

    public C60432i(Activity activity, ImageView imageView, View view, C66297d2.C15724d dVar) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(imageView, "coverIv");
        C87412m.m108594g(view, "replaceCoverIv");
        C87412m.m108594g(dVar, "callback");
        this.f172307d = activity;
        this.f172308e = imageView;
        this.f172309f = view;
        this.f172310g = dVar;
        view.setOnClickListener(new C60433a(this));
        this.f172316p = new C7777a0(activity, 100112);
    }

    /* renamed from: U5 */
    public void mo79064U5(boolean z, RecordMediaReportInfo recordMediaReportInfo, Bundle bundle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: l60.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: l60.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85404a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            java.lang.String r2 = "coverUrl"
            gy3.C87412m.m108594g(r7, r2)
            java.lang.String r2 = r6.f172311h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setCover liveCover:"
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r6.f172313j = r7
            r7 = 0
            r6.f172314n = r7
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62446e(r1)
            bl3.c r2 = r2.mo62447c(r0)
            pl1.s0 r2 = (pl1.C11990s0) r2
            k60.d r2 = r2.mo11871f2()
            pl1.n0 r3 = new pl1.n0
            java.lang.String r4 = r6.f172313j
            up1.y r5 = up1.C27696y.THUMB_IMAGE
            r3.<init>(r4, r5)
            l60.b r2 = r2.mo85955a(r3)
            pl1.e0$a r3 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r1 = r4.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r3)
            r2.mo138758f(r0)
            boolean r0 = r2 instanceof l60.C99342a
            if (r0 == 0) goto L_0x005e
            r7 = r2
            l60.a r7 = (l60.C99342a) r7
        L_0x005e:
            if (r7 == 0) goto L_0x006a
            android.widget.ImageView r0 = r6.f172308e
            il1.i$b r1 = new il1.i$b
            r1.<init>(r6)
            r7.mo138753h(r0, r1)
        L_0x006a:
            xk1.d2$d r7 = r6.f172310g
            r7.onChange()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60432i.mo85404a(java.lang.String):void");
    }

    /* renamed from: i2 */
    public void mo4197i2(Context context, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("key_extra_data", bundle);
        C87412m.m108592e(captureVideoNormalModel, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("KSEGMENTMEDIAINFO", captureVideoNormalModel);
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        activity.setResult(-1, intent);
        activity.finish();
    }

    /* renamed from: l1 */
    public boolean mo4198l1(Context context, Bundle bundle, CaptureDataManager.C94402a aVar) {
        return false;
    }
}
