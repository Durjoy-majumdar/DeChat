package fw1;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.LiveData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI;
import com.tencent.p014mm.plugin.gallery.p473ui.C94049a;
import com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import da0.C58246d;
import da0.C58247e;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import i21.C60242i;
import iy3.C60641c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k21.C60960c;
import kotlin.Result;
import kotlin.ResultKt;
import nj3.C76879j;
import p166hy.C8830s0;
import rx3.C13598b0;
import te3.e94;

/* renamed from: fw1.c */
public final class C98052c {

    /* renamed from: a */
    public static final C98052c f287486a = new C98052c();

    /* renamed from: b */
    public static C98050a f287487b;

    /* renamed from: c */
    public static C98055d f287488c;

    /* renamed from: d */
    public static WeakReference<AlbumPreviewUI> f287489d;

    /* renamed from: e */
    public static WeakReference<ImagePreviewUI> f287490e;

    /* renamed from: f */
    public static e94 f287491f;

    /* renamed from: g */
    public static int f287492g;

    /* renamed from: h */
    public static boolean f287493h;

    /* renamed from: i */
    public static boolean f287494i;

    /* renamed from: j */
    public static boolean f287495j;

    /* renamed from: k */
    public static final C32224a<C13598b0> f287496k = C98054e.f287499d;

    /* renamed from: l */
    public static boolean f287497l;

    /* renamed from: fw1.c$a */
    public static final class C59332a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C59332a f169627d = new C59332a();

        public C59332a() {
            super(0);
        }

        public Object invoke() {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_publish_template_media_total_duration_seconds, 600);
            Log.m105924i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaTotalDurationLimitSeconds: " + Qe);
            boolean z = false;
            if (C98052c.f287492g / 1000 > Qe) {
                C76879j.m92726T(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.m1w, new Object[]{Integer.valueOf(C60641c.m70921b(((float) Qe) / 60.0f))}));
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: fw1.c$c */
    public static final class C59333c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f169628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59333c(C32224a<C13598b0> aVar) {
            super(1);
            this.f169628d = aVar;
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            C60960c.f173618a.mo85927k("SnsPublishProcess", "agreeCnt", 1, C60242i.APPEND);
            Log.m105924i("MicroMsg.MJTemplateHandle", "onSendItemClick get permission");
            this.f169628d.invoke();
            C98052c.f287497l = false;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fw1.c$d */
    public static final class C59334d extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C59334d f169629d = new C59334d();

        public C59334d() {
            super(1);
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C60960c.f173618a.mo85927k("SnsPublishProcess", booleanValue ? "blankCnt" : "refuseCnt", 1, C60242i.APPEND);
            Log.m105924i("MicroMsg.MJTemplateHandle", "onSendItemClick deny permission, cancel: " + booleanValue);
            C98052c.f287497l = false;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fw1.c$b */
    public static final class C98053b<T> implements C0120a0 {

        /* renamed from: d */
        public static final C98053b<T> f287498d = new C98053b<>();

        public void onChanged(Object obj) {
            Integer num = (Integer) obj;
            ((C98054e) C98052c.f287496k).invoke();
        }
    }

    /* renamed from: fw1.c$e */
    public static final class C98054e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C98054e f287499d = new C98054e();

        public C98054e() {
            super(0);
        }

        public Object invoke() {
            C98050a aVar = C98052c.f287487b;
            boolean z = false;
            int i = 1;
            if (aVar != null && aVar.f287475f) {
                if (!C98052c.f287494i) {
                    if (aVar != null && aVar.mo137352a()) {
                        z = true;
                    }
                    if (!z) {
                        if (!C98052c.f287493h) {
                            i = 9;
                        }
                    }
                }
                i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_publish_template_media_num, 20);
                Log.m105924i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + i);
            } else {
                i = -1;
            }
            if (i > 0) {
                WeakReference<AlbumPreviewUI> weakReference = C98052c.f287489d;
                ImagePreviewUI imagePreviewUI = null;
                AlbumPreviewUI albumPreviewUI = weakReference != null ? weakReference.get() : null;
                if (albumPreviewUI != null) {
                    albumPreviewUI.mo128957d8(i);
                }
                WeakReference<ImagePreviewUI> weakReference2 = C98052c.f287490e;
                if (weakReference2 != null) {
                    imagePreviewUI = weakReference2.get();
                }
                if (imagePreviewUI != null) {
                    imagePreviewUI.mo129006e8(i);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo137355a(AlbumPreviewUI albumPreviewUI) {
        e94 e94;
        byte[] byteArrayExtra;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(hashCode());
        sb.append(" bind ui:");
        ArrayList<GalleryItem$MediaItem> arrayList = null;
        sb.append(albumPreviewUI != null ? Integer.valueOf(albumPreviewUI.hashCode()) : null);
        sb.append(']');
        Log.m105924i("MicroMsg.MJTemplateHandle", sb.toString());
        if (albumPreviewUI != null) {
            f287489d = new WeakReference<>(albumPreviewUI);
            C98050a aVar = f287487b;
            if (aVar != null) {
                aVar.f287473d = null;
            }
            Integer value = aVar != null ? aVar.f287477h.getValue() : null;
            f287487b = null;
            Intent intent = albumPreviewUI.getIntent();
            if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("album_template_info")) == null) {
                e94 = null;
            } else {
                e94 = new e94();
                try {
                    e94.parseFrom(byteArrayExtra);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            f287491f = e94;
            C98050a aVar2 = new C98050a(new WeakReference(albumPreviewUI), f287491f);
            C59332a aVar3 = C59332a.f169627d;
            C87412m.m108594g(aVar3, "<set-?>");
            aVar2.f287484r = aVar3;
            if (value != null) {
                int intValue = value.intValue();
                Log.m105924i("MicroMsg.GalleryTemplateUI", "setSelectStateValue: " + intValue);
                aVar2.f287476g.setValue(Integer.valueOf(intValue));
            }
            f287487b = aVar2;
            LiveData<Integer> liveData = aVar2.f287477h;
            if (liveData != null) {
                liveData.observe(albumPreviewUI, C98053b.f287498d);
            }
            C94049a aVar4 = albumPreviewUI.f271290h;
            if (aVar4 != null) {
                arrayList = aVar4.f271542g;
            }
            if (arrayList != null) {
                mo137359e(arrayList);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo137356b() {
        C98050a aVar = f287487b;
        if (aVar != null && aVar.f287475f) {
            if (aVar != null && aVar.mo137352a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo137357c(ArrayList<GalleryItem$MediaItem> arrayList, C32224a<C13598b0> aVar) {
        Context context;
        AlbumPreviewUI albumPreviewUI;
        Object obj;
        C60242i iVar = C60242i.APPEND;
        Class cls = C58247e.class;
        C87412m.m108594g(arrayList, "mediaList");
        C87412m.m108594g(aVar, "onRequestResult");
        WeakReference<AlbumPreviewUI> weakReference = f287489d;
        AlbumPreviewUI albumPreviewUI2 = weakReference != null ? weakReference.get() : null;
        C98050a aVar2 = f287487b;
        if (aVar2 != null && aVar2.f287475f) {
            if (((aVar2 != null && aVar2.mo137352a()) || f287494i) && albumPreviewUI2 != null) {
                if (((C58247e) C86312j.m106911c(cls)).mo82982Tl().mo71103a("scene_sns")) {
                    Log.m105924i("MicroMsg.MJTemplateHandle", "onSendItemClick has permission");
                    e94 e94 = f287491f;
                    Log.m105924i("MicroMsg.MJTemplateHandle", "jumpToTemplatePage");
                    C60960c.f173618a.mo85927k("SnsPublishProcess", "egsessionCnt", 1, iVar);
                    C58247e eVar = (C58247e) C86312j.m106911c(cls);
                    Intent intent = new Intent();
                    if (e94 != null) {
                        try {
                            Result.Companion companion = Result.Companion;
                            obj = Result.m168114constructorimpl(intent.putExtra("key_video_template_info", e94.toByteArray()));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
                        }
                        Throwable r122 = Result.m168117exceptionOrNullimpl(obj);
                        if (r122 != null) {
                            Log.printErrStackTrace("MicroMsg.MJTemplateHandle", r122, "to array error", new Object[0]);
                        }
                        intent.putExtra("key_maas_entrance", 101);
                        Log.m105924i("MicroMsg.MJTemplateHandle", "cut same");
                    } else {
                        intent.putExtra("key_maas_entrance", 100);
                        Log.m105924i("MicroMsg.MJTemplateHandle", "post main");
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                    eVar.bv0(albumPreviewUI2, 4384, arrayList, intent);
                    return true;
                }
                Log.m105924i("MicroMsg.MJTemplateHandle", "onSendItemClick no permission, permissionRequesting: " + f287497l);
                if (f287497l) {
                    return true;
                }
                f287497l = true;
                C60960c.f173618a.mo85927k("SnsPublishProcess", "permissionSheetCnt", 1, iVar);
                C58246d Tl = ((C58247e) C86312j.m106911c(cls)).mo82982Tl();
                WeakReference<AlbumPreviewUI> weakReference2 = f287489d;
                if (weakReference2 == null || (albumPreviewUI = weakReference2.get()) == null || (context = albumPreviewUI.getContext()) == null) {
                    context = MMApplicationContext.getContext();
                }
                C87412m.m108593f(context, "albumUI?.toInstance()?.c…ationContext.getContext()");
                Tl.mo71104b("scene_sns", context, new C59333c(aVar), C59334d.f169629d);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo137358d() {
        boolean z = true;
        f287495j = true;
        C60960c.C60961a aVar = C60960c.f173618a;
        C98050a aVar2 = f287487b;
        int i = 0;
        if (aVar2 != null) {
            e94 e94 = aVar2.f287474e;
            if ((e94 != null ? e94.f182943e : null) == null) {
                z = false;
            }
            i = z ? 3 : aVar2.f287483q;
        }
        aVar.mo85926j("SnsTemplate", FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(i));
        String ey = ((C8830s0) C86312j.m106911c(C8830s0.class)).mo9667ey();
        C87412m.m108593f(ey, "getService(\n            …).checkSnsPostSessionId()");
        aVar.mo85926j("SnsTemplate", "sessionID", ey);
        C60960c.C60961a.m71444b(aVar, "SnsTemplate", false, false, 4, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0112  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137359e(java.util.ArrayList<com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem> r9) {
        /*
            r8 = this;
            r0 = 0
            f287492g = r0
            r1 = 0
            r2 = 1
            r3 = 2
            if (r9 == 0) goto L_0x0051
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r9.iterator()
        L_0x0011:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x002d
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r7 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r7
            int r7 = r7.getType()
            if (r7 != r3) goto L_0x0026
            r7 = 1
            goto L_0x0027
        L_0x0026:
            r7 = 0
        L_0x0027:
            if (r7 == 0) goto L_0x0011
            r4.add(r6)
            goto L_0x0011
        L_0x002d:
            java.util.Iterator r4 = r4.iterator()
        L_0x0031:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r4.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r5 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r5
            int r6 = f287492g
            boolean r7 = r5 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r7 == 0) goto L_0x0046
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r5 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r5
            goto L_0x0047
        L_0x0046:
            r5 = r1
        L_0x0047:
            if (r5 == 0) goto L_0x004c
            int r5 = r5.f162766w
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            int r6 = r6 + r5
            f287492g = r6
            goto L_0x0031
        L_0x0051:
            fw1.a r4 = f287487b
            if (r4 == 0) goto L_0x005b
            boolean r4 = r4.f287475f
            if (r4 != r2) goto L_0x005b
            r4 = 1
            goto L_0x005c
        L_0x005b:
            r4 = 0
        L_0x005c:
            if (r4 == 0) goto L_0x0194
            if (r9 == 0) goto L_0x0063
            r9.size()
        L_0x0063:
            fw1.a r4 = f287487b
            r5 = 8
            if (r4 == 0) goto L_0x00ca
            boolean r6 = r4.f287475f
            if (r6 != 0) goto L_0x006e
            goto L_0x00ca
        L_0x006e:
            te3.e94 r6 = r4.f287474e
            if (r6 == 0) goto L_0x0074
            java.lang.String r1 = r6.f182943e
        L_0x0074:
            if (r1 == 0) goto L_0x0078
            r1 = 1
            goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            if (r1 == 0) goto L_0x007c
            goto L_0x00ca
        L_0x007c:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI> r1 = r4.f287473d
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r1.get()
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r1 = (com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI) r1
            if (r1 == 0) goto L_0x0092
            android.widget.TextView r6 = r1.f271284e
            r6.setClickable(r2)
            android.widget.TextView r1 = r1.f271284e
            r1.setEnabled(r2)
        L_0x0092:
            java.lang.String r1 = fw1.C45817b.m51100a(r9)
            int r6 = r1.length()
            if (r6 != 0) goto L_0x009e
            r6 = 1
            goto L_0x009f
        L_0x009e:
            r6 = 0
        L_0x009f:
            if (r6 == 0) goto L_0x00a4
            r6 = 8
            goto L_0x00a5
        L_0x00a4:
            r6 = 0
        L_0x00a5:
            android.widget.TextView r7 = r4.f287482p
            if (r7 != 0) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            r7.setText(r1)
        L_0x00ad:
            android.widget.LinearLayout r1 = r4.f287481o
            if (r1 == 0) goto L_0x00b9
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x00b9
            r1 = 1
            goto L_0x00ba
        L_0x00b9:
            r1 = 0
        L_0x00ba:
            if (r1 == 0) goto L_0x00bf
            if (r6 != 0) goto L_0x00bf
            goto L_0x00ca
        L_0x00bf:
            android.widget.LinearLayout r1 = r4.f287481o
            if (r1 != 0) goto L_0x00c4
            goto L_0x00c7
        L_0x00c4:
            r1.setVisibility(r6)
        L_0x00c7:
            r4.mo137353b(r6)
        L_0x00ca:
            if (r9 == 0) goto L_0x00d4
            int r1 = r9.size()
            if (r1 != r2) goto L_0x00d4
            r1 = 1
            goto L_0x00d5
        L_0x00d4:
            r1 = 0
        L_0x00d5:
            if (r1 == 0) goto L_0x00e1
            java.lang.Object r1 = sx3.C110818d0.m150914L(r9)
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r1 == 0) goto L_0x00e1
            r1 = 1
            goto L_0x00e2
        L_0x00e1:
            r1 = 0
        L_0x00e2:
            f287493h = r1
            if (r9 == 0) goto L_0x010f
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L_0x00ed
            goto L_0x010a
        L_0x00ed:
            java.util.Iterator r1 = r9.iterator()
        L_0x00f1:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x010a
            java.lang.Object r4 = r1.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r4 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r4
            int r4 = r4.getType()
            if (r4 != r3) goto L_0x0105
            r4 = 1
            goto L_0x0106
        L_0x0105:
            r4 = 0
        L_0x0106:
            if (r4 == 0) goto L_0x00f1
            r1 = 1
            goto L_0x010b
        L_0x010a:
            r1 = 0
        L_0x010b:
            if (r1 != r2) goto L_0x010f
            r1 = 1
            goto L_0x0110
        L_0x010f:
            r1 = 0
        L_0x0110:
            if (r1 == 0) goto L_0x013f
            boolean r1 = r9 instanceof java.util.Collection
            if (r1 == 0) goto L_0x011d
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L_0x011d
            goto L_0x013a
        L_0x011d:
            java.util.Iterator r1 = r9.iterator()
        L_0x0121:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x013a
            java.lang.Object r4 = r1.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r4 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r4
            int r4 = r4.getType()
            if (r4 != r2) goto L_0x0135
            r4 = 1
            goto L_0x0136
        L_0x0135:
            r4 = 0
        L_0x0136:
            if (r4 == 0) goto L_0x0121
            r1 = 1
            goto L_0x013b
        L_0x013a:
            r1 = 0
        L_0x013b:
            if (r1 == 0) goto L_0x013f
            r1 = 1
            goto L_0x0140
        L_0x013f:
            r1 = 0
        L_0x0140:
            f287494i = r1
            if (r1 == 0) goto L_0x0162
            fw1.a r1 = f287487b
            if (r1 == 0) goto L_0x0162
            androidx.lifecycle.LiveData<java.lang.Integer> r4 = r1.f287477h
            java.lang.Object r4 = r4.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L_0x0153
            goto L_0x0159
        L_0x0153:
            int r4 = r4.intValue()
            if (r4 == r3) goto L_0x0162
        L_0x0159:
            androidx.lifecycle.z<java.lang.Integer> r1 = r1.f287476g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.setValue(r3)
        L_0x0162:
            fw1.d r1 = f287488c
            if (r1 == 0) goto L_0x018d
            java.lang.String r9 = fw1.C45817b.m51100a(r9)
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0171
            goto L_0x0172
        L_0x0171:
            r2 = 0
        L_0x0172:
            if (r2 == 0) goto L_0x0185
            android.view.ViewGroup r2 = r1.f287500a
            if (r2 != 0) goto L_0x0179
            goto L_0x017c
        L_0x0179:
            r2.setVisibility(r0)
        L_0x017c:
            android.widget.TextView r0 = r1.f287501b
            if (r0 != 0) goto L_0x0181
            goto L_0x018d
        L_0x0181:
            r0.setText(r9)
            goto L_0x018d
        L_0x0185:
            android.view.ViewGroup r9 = r1.f287500a
            if (r9 != 0) goto L_0x018a
            goto L_0x018d
        L_0x018a:
            r9.setVisibility(r5)
        L_0x018d:
            fy3.a<rx3.b0> r9 = f287496k
            fw1.c$e r9 = (fw1.C98052c.C98054e) r9
            r9.invoke()
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fw1.C98052c.mo137359e(java.util.ArrayList):void");
    }
}
