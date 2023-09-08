package qw1;

import c30.C26827e;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p645pj.C35511a;

/* renamed from: qw1.b */
public final class C63339b {

    /* renamed from: a */
    public static final C63339b f179706a = new C63339b();

    /* renamed from: b */
    public static final HashMap<Integer, JSONObject> f179707b;

    /* renamed from: c */
    public static final HashMap<Integer, ArrayList<JSONObject>> f179708c = new HashMap<>();

    static {
        HashMap<Integer, JSONObject> hashMap = new HashMap<>();
        f179707b = hashMap;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(".h264");
        jSONArray.put(".h26l");
        jSONArray.put(".264");
        jSONArray.put(".avc");
        jSONArray.put(".mov");
        jSONArray.put(".mp4");
        jSONArray.put(".m4a");
        jSONArray.put(".3gp");
        jSONArray.put(".3g2");
        jSONArray.put(".mj2");
        jSONArray.put(".m4v");
        jSONObject.put("suffix", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("video/avc");
        jSONArray2.put("video/hevc");
        jSONArray2.put("video/dolby-vision");
        jSONObject.put("video-mime", jSONArray2);
        C26827e eVar = new C26827e();
        eVar.mo53846q("audio/mp4a-latm");
        jSONObject.put("audio-mime", eVar);
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_album_check_file_format, true)) {
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put(MimeTypes.VIDEO_MP4);
            jSONArray3.put("mov,mp4,m4a,3gp,3g2,mj2");
            jSONObject.put("file-format", jSONArray3);
        }
        hashMap.put(-1, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("include_local_setting", true);
        jSONObject2.put("min-duration-ms", 1000);
        jSONObject2.put("max-duration-ms", 300000);
        hashMap.put(31, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("include_local_setting", true);
        jSONObject3.put("max-duration-ms", C35511a.f94971a.mo60284b());
        hashMap.put(4, jSONObject3);
    }

    /* renamed from: a */
    public final void mo88235a(ArrayList<JSONObject> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            arrayList.add(jSONObject);
            if (jSONObject.optBoolean("include_local_setting", false) && (jSONObject2 = f179707b.get(-1)) != null) {
                arrayList.add(jSONObject2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03e1, code lost:
        if (s62.C101554f.m133322g() == false) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03f9, code lost:
        if (p206nj.C11171e.m11044a(24) != false) goto L_0x03fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x052e A[LOOP:1: B:33:0x00ec->B:217:0x052e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x052c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0273  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo88236b(int r29, com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            java.lang.String r3 = "scene"
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r2, r4)
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<org.json.JSONObject>> r4 = f179708c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r29)
            boolean r4 = r4.containsKey(r5)
            r5 = -1
            java.lang.String r7 = "MicroMsg.AlbumSelectRestriction"
            if (r4 != 0) goto L_0x00cb
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_album_select_restriction
            java.lang.String r9 = ""
            java.lang.String r4 = r4.Y60(r8, r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "print scene:"
            r8.append(r9)
            r8.append(r1)
            java.lang.String r9 = " restriction:"
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ Exception -> 0x0072 }
            r10.<init>(r4)     // Catch:{ Exception -> 0x0072 }
            int r4 = r10.length()     // Catch:{ Exception -> 0x0072 }
            r11 = r9
            r12 = 0
        L_0x0059:
            if (r12 >= r4) goto L_0x0074
            org.json.JSONObject r13 = r10.getJSONObject(r12)     // Catch:{ Exception -> 0x0070 }
            int r14 = r13.optInt(r3)     // Catch:{ Exception -> 0x0070 }
            if (r14 != r1) goto L_0x0066
            r9 = r13
        L_0x0066:
            int r14 = r13.optInt(r3)     // Catch:{ Exception -> 0x0070 }
            if (r14 != r5) goto L_0x006d
            r11 = r13
        L_0x006d:
            int r12 = r12 + 1
            goto L_0x0059
        L_0x0070:
            goto L_0x0074
        L_0x0072:
            r11 = r9
        L_0x0074:
            r0.mo88235a(r8, r9)
            int r3 = r8.size()
            if (r3 > 0) goto L_0x0080
            r0.mo88235a(r8, r11)
        L_0x0080:
            int r3 = r8.size()
            if (r3 > 0) goto L_0x0095
            java.util.HashMap<java.lang.Integer, org.json.JSONObject> r3 = f179707b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r29)
            java.lang.Object r3 = r3.get(r4)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            r0.mo88235a(r8, r3)
        L_0x0095:
            int r3 = r8.size()
            if (r3 > 0) goto L_0x00aa
            java.util.HashMap<java.lang.Integer, org.json.JSONObject> r3 = f179707b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object r3 = r3.get(r4)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            r0.mo88235a(r8, r3)
        L_0x00aa:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r29)
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<org.json.JSONObject>> r4 = f179708c
            r4.put(r3, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkArray size:"
            r3.append(r4)
            int r4 = r8.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
        L_0x00cb:
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<org.json.JSONObject>> r3 = f179708c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            java.lang.Object r1 = r3.get(r1)
            gy3.C87412m.m108591d(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r3 = r1.size()
            if (r3 > 0) goto L_0x00e8
            java.lang.String r1 = "never happen!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
        L_0x00e5:
            r3 = 0
            goto L_0x0535
        L_0x00e8:
            java.util.Iterator r1 = r1.iterator()
        L_0x00ec:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00e5
            java.lang.Object r3 = r1.next()
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            if (r3 != 0) goto L_0x00ff
            r29 = r1
            r1 = 0
            goto L_0x046d
        L_0x00ff:
            java.lang.String r4 = "long-side-limit"
            int r4 = r3.optInt(r4, r5)
            java.lang.String r8 = "short-side-limit"
            int r8 = r3.optInt(r8, r5)
            java.lang.String r9 = "suffix"
            org.json.JSONArray r9 = r3.optJSONArray(r9)
            java.lang.String r10 = "min-duration-ms"
            int r10 = r3.optInt(r10, r5)
            java.lang.String r11 = "max-duration-ms"
            int r11 = r3.optInt(r11, r5)
            r12 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r14 = "max-ratio"
            double r14 = r3.optDouble(r14, r12)
            java.lang.String r5 = "min-ratio"
            double r12 = r3.optDouble(r5, r12)
            java.lang.String r5 = "video-mime"
            org.json.JSONArray r5 = r3.optJSONArray(r5)
            java.lang.String r6 = "audio-mime"
            org.json.JSONArray r6 = r3.optJSONArray(r6)
            java.lang.String r0 = "file-format"
            r29 = r1
            org.json.JSONArray r1 = r3.optJSONArray(r0)
            r16 = r0
            java.lang.String r0 = "qt-file"
            r17 = r1
            r1 = 0
            boolean r0 = r3.optBoolean(r0, r1)
            boolean r1 = r2 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r1 == 0) goto L_0x0528
            if (r4 <= 0) goto L_0x0155
            r3 = 1
            goto L_0x0156
        L_0x0155:
            r3 = 0
        L_0x0156:
            java.lang.String r1 = " config:"
            if (r3 == 0) goto L_0x0191
            r3 = r2
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r3
            r18 = r6
            int r6 = r3.f162767x
            r19 = r5
            int r5 = r3.f162768y
            int r5 = java.lang.Math.max(r6, r5)
            if (r5 <= r4) goto L_0x0195
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "disable by long side ,origin:"
            r0.append(r5)
            int r5 = r3.f162767x
            int r3 = r3.f162768y
            int r3 = java.lang.Math.max(r5, r3)
            r0.append(r3)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r1 = 301(0x12d, float:4.22E-43)
            goto L_0x046d
        L_0x0191:
            r19 = r5
            r18 = r6
        L_0x0195:
            if (r8 <= 0) goto L_0x0199
            r3 = 1
            goto L_0x019a
        L_0x0199:
            r3 = 0
        L_0x019a:
            if (r3 == 0) goto L_0x01cf
            r3 = r2
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r3
            int r4 = r3.f162767x
            int r5 = r3.f162768y
            int r4 = java.lang.Math.min(r4, r5)
            if (r4 >= r8) goto L_0x01cf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "disable by short side ,origin:"
            r0.append(r4)
            int r4 = r3.f162767x
            int r3 = r3.f162768y
            int r3 = java.lang.Math.min(r4, r3)
            r0.append(r3)
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r1 = 302(0x12e, float:4.23E-43)
            goto L_0x046d
        L_0x01cf:
            if (r9 == 0) goto L_0x028d
            java.lang.String r3 = r2.f162747d
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x01dd
            r20 = r12
            goto L_0x0270
        L_0x01dd:
            gy3.C87412m.m108591d(r3)
            int r4 = r3.length()
            r5 = 1
            int r4 = r4 - r5
            r6 = r4
            r4 = 0
            r5 = 0
        L_0x01e9:
            if (r4 > r6) goto L_0x0214
            if (r5 != 0) goto L_0x01ef
            r8 = r4
            goto L_0x01f0
        L_0x01ef:
            r8 = r6
        L_0x01f0:
            char r8 = r3.charAt(r8)
            r20 = r12
            r12 = 32
            int r8 = gy3.C87412m.m108596i(r8, r12)
            if (r8 > 0) goto L_0x0200
            r8 = 1
            goto L_0x0201
        L_0x0200:
            r8 = 0
        L_0x0201:
            if (r5 != 0) goto L_0x020c
            if (r8 != 0) goto L_0x0209
            r12 = r20
            r5 = 1
            goto L_0x01e9
        L_0x0209:
            int r4 = r4 + 1
            goto L_0x0211
        L_0x020c:
            if (r8 != 0) goto L_0x020f
            goto L_0x0216
        L_0x020f:
            int r6 = r6 + -1
        L_0x0211:
            r12 = r20
            goto L_0x01e9
        L_0x0214:
            r20 = r12
        L_0x0216:
            int r6 = r6 + 1
            java.lang.CharSequence r3 = r3.subSequence(r4, r6)
            java.lang.String r3 = r3.toString()
            r24 = 0
            r25 = 0
            r26 = 6
            r27 = 0
            java.lang.String r23 = "."
            r22 = r3
            int r4 = z04.C112550d0.m153772H(r22, r23, r24, r25, r26, r27)
            if (r4 < 0) goto L_0x0270
            int r5 = r3.length()
            if (r4 < r5) goto L_0x0239
            goto L_0x0270
        L_0x0239:
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r4 = "this as java.lang.String).toLowerCase()"
            gy3.C87412m.m108593f(r3, r4)
            int r5 = r9.length()
            r6 = 0
            r8 = 0
        L_0x0253:
            if (r6 >= r5) goto L_0x0271
            java.lang.String r12 = r9.optString(r6)
            java.lang.String r13 = "suffixArray.optString(i)"
            gy3.C87412m.m108593f(r12, r13)
            java.lang.String r12 = r12.toLowerCase()
            gy3.C87412m.m108593f(r12, r4)
            boolean r12 = gy3.C87412m.m108589b(r12, r3)
            if (r12 == 0) goto L_0x026d
            r8 = 1
        L_0x026d:
            int r6 = r6 + 1
            goto L_0x0253
        L_0x0270:
            r8 = 0
        L_0x0271:
            if (r8 != 0) goto L_0x028f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "disable by Suffix ,origin:"
            r0.append(r1)
            java.lang.String r1 = r2.f162747d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x046d
        L_0x028d:
            r20 = r12
        L_0x028f:
            r3 = r2
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r3
            java.lang.String r4 = r3.f162747d
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x029b
            goto L_0x02d3
        L_0x029b:
            boolean r4 = hd0.C98403m0.m127703c(r4)
            if (r4 != 0) goto L_0x02a2
            goto L_0x02cc
        L_0x02a2:
            if (r0 != 0) goto L_0x02a7
            if (r4 == 0) goto L_0x02a7
            goto L_0x02d3
        L_0x02a7:
            java.lang.String r0 = r3.f162764u
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02ce
            java.lang.String r0 = r3.f162764u
            boolean r0 = s62.C101554f.m133316a(r0)
            if (r0 == 0) goto L_0x02ce
            java.lang.String r0 = r3.f162765v
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02ce
            java.lang.String r0 = r3.f162765v
            boolean r0 = s62.C101554f.m133316a(r0)
            if (r0 == 0) goto L_0x02ce
            java.lang.String r0 = "qt video can decode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x02cc:
            r0 = 1
            goto L_0x02d4
        L_0x02ce:
            java.lang.String r0 = "qt video cannot decode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x02d3:
            r0 = 0
        L_0x02d4:
            if (r0 != 0) goto L_0x02df
            java.lang.String r0 = "disable by qt file check"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x046d
        L_0x02df:
            if (r10 <= 0) goto L_0x02e3
            r0 = 1
            goto L_0x02e4
        L_0x02e3:
            r0 = 0
        L_0x02e4:
            if (r0 == 0) goto L_0x030a
            int r0 = r3.f162766w
            if (r0 >= r10) goto L_0x030a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "disable by min time,origin:"
            r0.append(r4)
            int r3 = r3.f162766w
            r0.append(r3)
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r1 = 201(0xc9, float:2.82E-43)
            goto L_0x046d
        L_0x030a:
            if (r11 <= 0) goto L_0x030e
            r0 = 1
            goto L_0x030f
        L_0x030e:
            r0 = 0
        L_0x030f:
            if (r0 == 0) goto L_0x0335
            int r0 = r3.f162766w
            if (r0 <= r11) goto L_0x0335
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "disable by max time,origin:"
            r0.append(r4)
            int r3 = r3.f162766w
            r0.append(r3)
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r1 = 202(0xca, float:2.83E-43)
            goto L_0x046d
        L_0x0335:
            r4 = 0
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x033d
            r0 = 1
            goto L_0x033e
        L_0x033d:
            r0 = 0
        L_0x033e:
            if (r0 == 0) goto L_0x036a
            int r0 = r3.f162767x
            float r0 = (float) r0
            int r6 = r3.f162768y
            float r6 = (float) r6
            float r0 = r0 / r6
            double r8 = (double) r0
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x036a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "disable by max ratio,origin:"
            r3.append(r4)
            r3.append(r0)
            r3.append(r1)
            r3.append(r14)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r1 = 303(0x12f, float:4.25E-43)
            goto L_0x046d
        L_0x036a:
            int r0 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0370
            r0 = 1
            goto L_0x0371
        L_0x0370:
            r0 = 0
        L_0x0371:
            if (r0 == 0) goto L_0x039f
            int r0 = r3.f162767x
            float r0 = (float) r0
            int r4 = r3.f162768y
            float r4 = (float) r4
            float r0 = r0 / r4
            double r4 = (double) r0
            int r6 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r6 >= 0) goto L_0x039f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "disable by min ratio,origin:"
            r3.append(r4)
            r3.append(r0)
            r3.append(r1)
            r0 = r20
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r1 = 304(0x130, float:4.26E-43)
            goto L_0x046d
        L_0x039f:
            java.lang.String r0 = r3.f162764u
            if (r19 == 0) goto L_0x03fd
            int r4 = r19.length()
            if (r4 != 0) goto L_0x03aa
            goto L_0x03fd
        L_0x03aa:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x03b3
            r8 = r19
            goto L_0x03fb
        L_0x03b3:
            int r4 = r19.length()
            r5 = 0
            r6 = 0
        L_0x03b9:
            if (r5 >= r4) goto L_0x03ce
            r8 = r19
            java.lang.String r9 = r8.optString(r5)
            r10 = 1
            boolean r9 = z04.C112551y.m153809i(r9, r0, r10)
            if (r9 == 0) goto L_0x03c9
            r6 = 1
        L_0x03c9:
            int r5 = r5 + 1
            r19 = r8
            goto L_0x03b9
        L_0x03ce:
            r8 = r19
            r10 = 1
            if (r6 != 0) goto L_0x03d4
            goto L_0x03fb
        L_0x03d4:
            java.lang.String r4 = "video/hevc"
            boolean r4 = z04.C112551y.m153809i(r4, r0, r10)
            if (r4 == 0) goto L_0x03e4
            boolean r4 = s62.C101554f.m133322g()
            if (r4 != 0) goto L_0x03e4
            goto L_0x03fb
        L_0x03e4:
            java.lang.String r4 = "video/dolby-vision"
            boolean r0 = z04.C112551y.m153809i(r4, r0, r10)
            if (r0 == 0) goto L_0x03ff
            boolean r0 = s62.C101554f.m133322g()
            if (r0 == 0) goto L_0x03fb
            r0 = 24
            boolean r0 = p206nj.C11171e.m11044a(r0)
            if (r0 == 0) goto L_0x03ff
        L_0x03fb:
            r0 = 0
            goto L_0x0400
        L_0x03fd:
            r8 = r19
        L_0x03ff:
            r0 = 1
        L_0x0400:
            java.lang.String r4 = "disable by video mime check,origin:"
            if (r0 != 0) goto L_0x0421
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r3 = r3.f162764u
            r0.append(r3)
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x046d
        L_0x0421:
            java.lang.String r0 = r3.f162765v
            if (r18 == 0) goto L_0x044e
            int r5 = r18.length()
            if (r5 != 0) goto L_0x042c
            goto L_0x044e
        L_0x042c:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x0433
            goto L_0x044e
        L_0x0433:
            int r5 = r18.length()
            r6 = 0
            r9 = 0
        L_0x0439:
            if (r6 >= r5) goto L_0x044f
            r10 = r18
            java.lang.String r11 = r10.optString(r6)
            r12 = 1
            boolean r11 = z04.C112551y.m153809i(r11, r0, r12)
            if (r11 == 0) goto L_0x0449
            r9 = 1
        L_0x0449:
            int r6 = r6 + 1
            r18 = r10
            goto L_0x0439
        L_0x044e:
            r9 = 1
        L_0x044f:
            if (r9 != 0) goto L_0x0470
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r3 = r3.f162764u
            r0.append(r3)
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r1 = 104(0x68, float:1.46E-43)
        L_0x046d:
            r3 = 0
            goto L_0x052a
        L_0x0470:
            java.lang.String r0 = r2.f162747d
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0479
            goto L_0x0489
        L_0x0479:
            if (r17 == 0) goto L_0x051b
            int r1 = r17.length()
            if (r1 != 0) goto L_0x0483
            goto L_0x051b
        L_0x0483:
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 != 0) goto L_0x048c
        L_0x0489:
            r3 = 0
            goto L_0x0519
        L_0x048c:
            oj.b r1 = new oj.b
            r1.<init>()
            gy3.C87412m.m108591d(r0)
            r1.mo161392k(r0)
            r3 = 0
            android.media.MediaFormat r1 = r1.mo161386e(r3)
            java.lang.String r4 = "extractor.getTrackFormat(0)"
            gy3.C87412m.m108593f(r1, r4)
            r4 = r16
            boolean r5 = r1.containsKey(r4)
            java.lang.String r6 = "path:"
            if (r5 != 0) goto L_0x04d9
            r5 = 1
            com.tencent.mm.plugin.sight.base.a r1 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r0, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r0)
            java.lang.String r5 = " format:"
            r4.append(r5)
            java.lang.String r5 = r1.f273457o
            r4.append(r5)
            java.lang.String r5 = " long-format:"
            r4.append(r5)
            java.lang.String r5 = r1.f273458p
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            java.lang.String r1 = r1.f273457o
            goto L_0x04dd
        L_0x04d9:
            java.lang.String r1 = r1.getString(r4)
        L_0x04dd:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r0)
            java.lang.String r0 = " final format:"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x04ff
        L_0x04fd:
            r8 = 1
            goto L_0x051d
        L_0x04ff:
            int r0 = r17.length()
            r4 = 0
        L_0x0504:
            if (r4 >= r0) goto L_0x0519
            r5 = r17
            java.lang.String r6 = r5.optString(r4)
            r8 = 1
            boolean r6 = z04.C112551y.m153809i(r6, r1, r8)
            if (r6 == 0) goto L_0x0514
            goto L_0x051d
        L_0x0514:
            int r4 = r4 + 1
            r17 = r5
            goto L_0x0504
        L_0x0519:
            r1 = 0
            goto L_0x051e
        L_0x051b:
            r3 = 0
            goto L_0x04fd
        L_0x051d:
            r1 = 1
        L_0x051e:
            if (r1 != 0) goto L_0x0529
            java.lang.String r0 = "disable by file format check"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x052a
        L_0x0528:
            r3 = 0
        L_0x0529:
            r1 = 0
        L_0x052a:
            if (r1 == 0) goto L_0x052e
            r6 = r1
            goto L_0x0536
        L_0x052e:
            r0 = r28
            r1 = r29
            r5 = -1
            goto L_0x00ec
        L_0x0535:
            r6 = 0
        L_0x0536:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qw1.C63339b.mo88236b(int, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem):int");
    }
}
