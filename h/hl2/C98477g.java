package hl2;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32227p;
import gy3.C87412m;
import hl2.C98481i;
import hl2.C98489n;
import java.util.ArrayList;
import java.util.Arrays;
import rx3.C13598b0;
import sk2.C101645e;
import te3.C101856vd;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: hl2.g */
public class C98477g implements C98489n {

    @C91590f(mo125468c = "com.tencent.mm.plugin.scanner.image.AiScanDefaultImageCDNStrategy$checkImageCdnStatus$1", mo125469f = "AiScanDefaultImageCDNStrategy.kt", mo125470l = {74}, mo125471m = "invokeSuspend")
    /* renamed from: hl2.g$a */
    public static final class C98478a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f288833d;

        /* renamed from: e */
        public final /* synthetic */ C101645e f288834e;

        /* renamed from: f */
        public final /* synthetic */ C98481i.C98483b f288835f;

        /* renamed from: g */
        public final /* synthetic */ C98481i.C98482a f288836g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98478a(C101645e eVar, C98481i.C98483b bVar, C98481i.C98482a aVar, C15601d<? super C98478a> dVar) {
            super(2, dVar);
            this.f288834e = eVar;
            this.f288835f = bVar;
            this.f288836g = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C98478a(this.f288834e, this.f288835f, this.f288836g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C98478a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0119  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0125  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r11.f288833d
                java.lang.String r2 = "MicroMsg.AIScanImageCdnUploadUtil"
                r3 = 2
                r4 = 0
                r5 = 1
                r6 = 3
                r7 = 0
                if (r1 == 0) goto L_0x001b
                if (r1 != r5) goto L_0x0013
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x006d
            L_0x0013:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001b:
                kotlin.ResultKt.throwOnFailure(r12)
                sk2.e r12 = r11.f288834e
                int r12 = r12.f297533b
                int r12 = hl2.C8596a.m8446a(r12)
                hl2.i$b r1 = r11.f288835f
                android.graphics.Point r1 = r1.f288840c
                if (r1 != 0) goto L_0x002d
                goto L_0x0040
            L_0x002d:
                java.lang.Object[] r8 = new java.lang.Object[r5]
                r8[r4] = r1
                java.lang.String r9 = "alvinluo isImageSizeLargerThanConfig image size: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r9, r8)
                int r8 = r1.x
                int r1 = r1.y
                int r8 = r8 * r1
                if (r8 <= r12) goto L_0x0040
                r1 = 1
                goto L_0x0041
            L_0x0040:
                r1 = 0
            L_0x0041:
                java.lang.Object[] r8 = new java.lang.Object[r3]
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
                r8[r4] = r9
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r12)
                r8[r5] = r9
                java.lang.String r9 = "MicroMsg.AiScanDefaultImageCDNStrategy"
                java.lang.String r10 = "alvinluo checkImageCdnStatus needCompress: %s, maxImageSize: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r8)
                if (r1 == 0) goto L_0x00c7
                hl2.i$b r1 = r11.f288835f
                java.lang.String r1 = r1.f288839b
                r11.f288833d = r5
                a14.h0 r8 = a14.C53872d1.f151119c
                hl2.c r9 = new hl2.c
                r9.<init>(r1, r12, r7)
                java.lang.Object r12 = a14.C53895h.m60469g(r8, r9, r11)
                if (r12 != r0) goto L_0x006d
                return r0
            L_0x006d:
                hl2.a$b r12 = (hl2.C8596a.C8598b) r12
                if (r12 == 0) goto L_0x0073
                java.lang.String r7 = r12.f27693c
            L_0x0073:
                if (r12 == 0) goto L_0x00b0
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
                if (r0 != 0) goto L_0x007c
                goto L_0x00b0
            L_0x007c:
                hl2.i$b r0 = r11.f288835f
                android.graphics.Point r1 = r0.f288840c
                if (r1 != 0) goto L_0x0089
                android.graphics.Point r1 = new android.graphics.Point
                r1.<init>()
                r0.f288840c = r1
            L_0x0089:
                hl2.i$b r0 = r11.f288835f
                android.graphics.Point r0 = r0.f288840c
                if (r0 == 0) goto L_0x0096
                int r1 = r12.f27694d
                int r7 = r12.f27695e
                r0.set(r1, r7)
            L_0x0096:
                hl2.i$b r0 = r11.f288835f
                java.lang.String r1 = r12.f27693c
                if (r1 != 0) goto L_0x009e
                java.lang.String r1 = ""
            L_0x009e:
                r0.getClass()
                r0.f288839b = r1
                sk2.e r0 = r11.f288834e
                java.lang.String r12 = r12.f27693c
                r0.f297535d = r12
                hl2.i$b r12 = r11.f288835f
                r12.f288844g = r5
                r12.f288843f = r5
                goto L_0x00c7
            L_0x00b0:
                hl2.i$a r12 = r11.f288836g
                hl2.i$c r0 = new hl2.i$c
                r0.<init>()
                r0.f288847c = r6
                r1 = 101(0x65, float:1.42E-43)
                r0.f288848d = r1
                java.lang.String r1 = "checkImageCdnStatus compress image failed"
                r0.f288849e = r1
                r12.mo137842a(r0)
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            L_0x00c7:
                hl2.i$b r12 = r11.f288835f
                hl2.i$a r0 = r11.f288836g
                java.lang.String r1 = "checkRequest"
                gy3.C87412m.m108594g(r12, r1)
                hl2.i$c r1 = new hl2.i$c
                r1.<init>()
                hl2.k r7 = new hl2.k
                r7.<init>()
                java.lang.String r8 = r12.f288839b
                java.lang.String r9 = "<set-?>"
                gy3.C87412m.m108594g(r8, r9)
                r7.f288857d = r8
                java.lang.String r8 = r12.f288841d
                gy3.C87412m.m108594g(r8, r9)
                r7.f288854a = r8
                java.lang.String r8 = r12.f288842e
                gy3.C87412m.m108594g(r8, r9)
                r7.f288855b = r8
                int r8 = r12.f288843f
                r7.f288856c = r8
                boolean r8 = r12.f288844g
                r7.f288858e = r8
                java.lang.Object[] r8 = new java.lang.Object[r3]
                android.graphics.Point r9 = r12.f288840c
                r8[r4] = r9
                java.lang.String r9 = r12.f288841d
                r8[r5] = r9
                java.lang.String r9 = "MicroMsg.AiScanImageCDNCheckHelper"
                java.lang.String r10 = "alvinluo checkImageCdnStatus imageSize: %s, fileId: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r8)
                rx3.g r8 = hl2.C8596a.f27688a
                hl2.j r8 = new hl2.j
                r8.<init>(r1, r7, r0, r12)
                java.lang.String r12 = r7.f288857d
                boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
                if (r12 != 0) goto L_0x0125
                hl2.l r12 = new hl2.l
                r0 = 401(0x191, float:5.62E-43)
                r12.<init>(r6, r0)
                r8.mo137846a(r12)
                goto L_0x01ee
            L_0x0125:
                gi.g r12 = new gi.g
                r12.<init>()
                java.lang.String r0 = "task_AiScanImagetUploadTask"
                r12.f287660d = r0
                java.lang.String r0 = r7.f288857d
                java.lang.String r1 = "filePath"
                gy3.C87412m.m108594g(r0, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r9 = eb0.C75592q0.m90789s()
                r1.append(r9)
                java.lang.String r9 = "_image_search_"
                r1.append(r9)
                r1.append(r0)
                r0 = 95
                r1.append(r0)
                long r9 = java.lang.System.currentTimeMillis()
                r1.append(r9)
                java.lang.String r0 = r1.toString()
                r12.field_mediaId = r0
                java.lang.String r1 = r7.f288857d
                r12.field_fullpath = r1
                int r1 = r7.f288856c
                if (r1 != r5) goto L_0x0166
                r9 = 1
                goto L_0x0167
            L_0x0166:
                r9 = 2
            L_0x0167:
                r12.field_fileType = r9
                r12.field_priority = r3
                r12.field_needStorage = r4
                if (r1 != r5) goto L_0x0171
                r9 = 1
                goto L_0x0172
            L_0x0171:
                r9 = 0
            L_0x0172:
                r12.field_needCompressImage = r9
                r12.field_isStreamMedia = r4
                r9 = 15
                r12.f287674u = r9
                boolean r9 = r7.f288858e
                if (r9 != 0) goto L_0x018b
                java.lang.String r9 = r7.f288854a
                r12.field_fileId = r9
                java.lang.String r9 = r7.f288855b
                r12.field_aesKey = r9
                r12.field_force_aeskeycdn = r4
                r12.field_trysafecdn = r5
                goto L_0x018f
            L_0x018b:
                r12.field_force_aeskeycdn = r5
                r12.field_trysafecdn = r4
            L_0x018f:
                r9 = 6
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r9[r4] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                r9[r5] = r0
                int r0 = r12.field_fileType
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r9[r3] = r0
                boolean r0 = r7.f288858e
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r9[r6] = r0
                r0 = 4
                java.lang.String r1 = r7.f288857d
                r9[r0] = r1
                r0 = 5
                java.lang.String r1 = r7.f288854a
                r9[r0] = r1
                java.lang.String r0 = "alvinluo checkCDNImage mediaId: %s, compressType: %s, fileType: %s forceReUpload: %s, imagePath: %s, fileId: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r9)
                hl2.b r0 = new hl2.b
                r0.<init>(r8, r7)
                r12.f287662f = r0
                java.lang.Class<qo.l> r0 = p663qo.C101213l.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                qo.l r0 = (p663qo.C101213l) r0
                boolean r0 = r0.if0(r12)
                if (r0 != 0) goto L_0x01e4
                java.lang.Object[] r0 = new java.lang.Object[r5]
                java.lang.String r12 = r12.field_mediaId
                r0[r4] = r12
                java.lang.String r12 = "alvinluo checkCDNImage add task failed mediaId: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r12, r0)
                hl2.l r12 = new hl2.l
                r0 = 402(0x192, float:5.63E-43)
                r12.<init>(r6, r0)
                r8.mo137846a(r12)
                goto L_0x01ee
            L_0x01e4:
                java.lang.String r12 = r12.field_mediaId
                java.lang.String r0 = "info.field_mediaId"
                gy3.C87412m.m108593f(r12, r0)
                r8.mo137848b(r12)
            L_0x01ee:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: hl2.C98477g.C98478a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: hl2.g$b */
    public static final class C98479b implements C98481i.C98482a {

        /* renamed from: a */
        public final /* synthetic */ C98489n.C98490a f288837a;

        public C98479b(C98489n.C98490a aVar) {
            this.f288837a = aVar;
        }

        /* renamed from: a */
        public void mo137842a(C98481i.C98484c cVar) {
            String str;
            C87412m.m108594g(cVar, "checkImageResult");
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(cVar.f288847c);
            objArr[1] = Integer.valueOf(cVar.f288848d);
            C101856vd vdVar = cVar.f288846b;
            String str2 = null;
            if (vdVar != null) {
                str = String.format("BizAiScanCdnImg fileId: %s, size: [%s, %s], cdn_src: %s, cdn_status: %s", Arrays.copyOf(new Object[]{vdVar.f299668g, Integer.valueOf(vdVar.f299666e), Integer.valueOf(vdVar.f299667f), Integer.valueOf(vdVar.f299665d), Integer.valueOf(vdVar.f299670i)}, 5));
                C87412m.m108593f(str, "format(format, *args)");
            } else {
                str = null;
            }
            objArr[2] = str;
            Log.m105925i("MicroMsg.AiScanDefaultImageCDNStrategy", "alvinluo getCDNImageInfoList-default errType: %s, errCode: %s: reUploadInfo: %s", objArr);
            int i = cVar.f288847c;
            if (i != 0 || cVar.f288848d != 0) {
                C98489n.C98490a aVar = this.f288837a;
                if (aVar != null) {
                    aVar.mo137849e(i, cVar.f288848d, cVar.f288849e);
                }
            } else if (cVar.f288846b != null) {
                ArrayList arrayList = new ArrayList();
                C101856vd vdVar2 = new C101856vd();
                vdVar2.f299670i = 1;
                vdVar2.f299665d = 3;
                C101856vd vdVar3 = cVar.f288846b;
                vdVar2.f299668g = vdVar3 != null ? vdVar3.f299668g : null;
                if (vdVar3 != null) {
                    str2 = vdVar3.f299669h;
                }
                vdVar2.f299669h = str2;
                arrayList.add(vdVar2);
                C98489n.C98490a aVar2 = this.f288837a;
                if (aVar2 != null) {
                    aVar2.mo137850f(arrayList);
                }
            } else {
                C98489n.C98490a aVar3 = this.f288837a;
                if (aVar3 != null) {
                    aVar3.mo137849e(4, 403, "checkImageCdnStatus re-upload cdn error");
                }
            }
        }

        /* renamed from: b */
        public void mo137843b(String str) {
            C87412m.m108594g(str, "mediaId");
            C98489n.C98490a aVar = this.f288837a;
            if (aVar != null) {
                aVar.mo137851g(str);
            }
        }
    }

    /* renamed from: a */
    public void mo137839a(C101645e eVar, C98489n.C98490a aVar) {
        C87412m.m108594g(eVar, "request");
        C98481i.C98483b bVar = new C98481i.C98483b(eVar.f297532a, 3);
        String str = eVar.f297535d;
        C87412m.m108593f(str, "request.imagePath");
        bVar.f288839b = str;
        String str2 = eVar.f297535d;
        Point point = null;
        if (!(str2 == null || str2.length() == 0) && C86013q1.m106450k(str2)) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            MMBitmapFactory.m98735d(str2, options);
            point = new Point(options.outWidth, options.outHeight);
        }
        bVar.f288840c = point;
        bVar.f288843f = 1;
        bVar.f288844g = true;
        mo137845b(eVar, bVar, new C98479b(aVar));
    }

    /* renamed from: b */
    public final void mo137845b(C101645e eVar, C98481i.C98483b bVar, C98481i.C98482a aVar) {
        C87412m.m108594g(eVar, "request");
        C87412m.m108594g(bVar, "checkImageRequest");
        C87412m.m108594g(aVar, "callback");
        C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C98478a(eVar, bVar, aVar, (C15601d<? super C98478a>) null), 3, (Object) null);
    }

    public String name() {
        return "MicroMsg.AiScanDefaultImageCDNStrategy";
    }
}
