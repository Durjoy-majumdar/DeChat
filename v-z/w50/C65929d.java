package w50;

import a70.C112760b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: w50.d */
public final class C65929d {

    /* renamed from: a */
    public static final C65929d f189535a = new C65929d();

    /* renamed from: b */
    public static final String f189536b = (C112760b.m154231g() + "live/filters");

    /* renamed from: c */
    public static final HashMap<Integer, String> f189537c = new HashMap<>();

    /* renamed from: w50.d$a */
    public static final class C65930a {

        /* renamed from: a */
        public final int f189538a;

        /* renamed from: b */
        public final String f189539b;

        /* renamed from: c */
        public final String f189540c;

        /* renamed from: d */
        public int f189541d;

        public C65930a(int i, String str, String str2, int i2) {
            C87412m.m108594g(str, "path");
            C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            this.f189538a = i;
            this.f189539b = str;
            this.f189540c = str2;
            this.f189541d = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C65930a)) {
                return false;
            }
            C65930a aVar = (C65930a) obj;
            return this.f189538a == aVar.f189538a && C87412m.m108589b(this.f189539b, aVar.f189539b) && C87412m.m108589b(this.f189540c, aVar.f189540c) && this.f189541d == aVar.f189541d;
        }

        public int hashCode() {
            return (((((this.f189538a * 31) + this.f189539b.hashCode()) * 31) + this.f189540c.hashCode()) * 31) + this.f189541d;
        }

        public String toString() {
            return "FilterInfo(key=" + this.f189538a + ", path=" + this.f189539b + ", title=" + this.f189540c + ", value=" + this.f189541d + ')';
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        cy3.C58003b.m67160a(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        cy3.C58003b.m67160a(r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0059, code lost:
        throw r13;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89969a(android.content.res.AssetManager r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "copyAssets assetsPath:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " localPath:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LiveCore.LiveFilterUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 0
            java.lang.String[] r2 = r11.list(r12)     // Catch:{ Exception -> 0x0091 }
            if (r2 != 0) goto L_0x0026
            return
        L_0x0026:
            int r3 = r2.length     // Catch:{ Exception -> 0x0091 }
            if (r3 != 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x005a
            java.io.InputStream r11 = r11.open(r12)     // Catch:{ Exception -> 0x0091 }
            java.io.OutputStream r12 = com.tencent.p014mm.vfs.C86013q1.m106429K(r13, r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r13 = "input"
            gy3.C87412m.m108593f(r11, r13)     // Catch:{ all -> 0x004c }
            java.lang.String r13 = "output"
            gy3.C87412m.m108593f(r12, r13)     // Catch:{ all -> 0x004c }
            r13 = 2
            r2 = 0
            cy3.C86147a.m106660b(r11, r12, r0, r13, r2)     // Catch:{ all -> 0x004c }
            cy3.C58003b.m67160a(r12, r2)     // Catch:{ all -> 0x0053 }
            cy3.C58003b.m67160a(r11, r2)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0099
        L_0x004c:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x004e }
        L_0x004e:
            r2 = move-exception
            cy3.C58003b.m67160a(r12, r13)     // Catch:{ all -> 0x0053 }
            throw r2     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r13 = move-exception
            cy3.C58003b.m67160a(r11, r12)     // Catch:{ Exception -> 0x0091 }
            throw r13     // Catch:{ Exception -> 0x0091 }
        L_0x005a:
            com.tencent.p014mm.vfs.C86013q1.m106461v(r13)     // Catch:{ Exception -> 0x0091 }
            int r3 = r2.length     // Catch:{ Exception -> 0x0091 }
            r4 = 0
        L_0x005f:
            if (r4 >= r3) goto L_0x0099
            r5 = r2[r4]     // Catch:{ Exception -> 0x0091 }
            w50.d r6 = f189535a     // Catch:{ Exception -> 0x0091 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091 }
            r7.<init>()     // Catch:{ Exception -> 0x0091 }
            r7.append(r12)     // Catch:{ Exception -> 0x0091 }
            r8 = 47
            r7.append(r8)     // Catch:{ Exception -> 0x0091 }
            r7.append(r5)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0091 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091 }
            r9.<init>()     // Catch:{ Exception -> 0x0091 }
            r9.append(r13)     // Catch:{ Exception -> 0x0091 }
            r9.append(r8)     // Catch:{ Exception -> 0x0091 }
            r9.append(r5)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r5 = r9.toString()     // Catch:{ Exception -> 0x0091 }
            r6.mo89969a(r11, r7, r5)     // Catch:{ Exception -> 0x0091 }
            int r4 = r4 + 1
            goto L_0x005f
        L_0x0091:
            r11 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r13 = "copyAssets"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r11, r13, r12)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w50.C65929d.mo89969a(android.content.res.AssetManager, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final String mo89970b(int i) {
        switch (i) {
            case 0:
                String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.dmd);
                C87412m.m108593f(string, "{\n                MMAppl…er_default)\n            }");
                return string;
            case 1:
                String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.dmc);
                C87412m.m108593f(string2, "{\n                MMAppl…lter_baixi)\n            }");
                return string2;
            case 2:
                String string3 = MMApplicationContext.getContext().getResources().getString(C0966R.string.dmq);
                C87412m.m108593f(string3, "{\n                MMAppl…ter_yuanqi)\n            }");
                return string3;
            case 3:
                String string4 = MMApplicationContext.getContext().getResources().getString(C0966R.string.dmf);
                C87412m.m108593f(string4, "{\n                MMAppl…ter_fennen)\n            }");
                return string4;
            case 4:
                String string5 = MMApplicationContext.getContext().getResources().getString(C0966R.string.dmm);
                C87412m.m108593f(string5, "{\n                MMAppl…er_qingche)\n            }");
                return string5;
            case 5:
                String string6 = MMApplicationContext.getContext().getResources().getString(C0966R.string.dmj);
                C87412m.m108593f(string6, "{\n                MMAppl…lter_luori)\n            }");
                return string6;
            case 6:
                String string7 = MMApplicationContext.getContext().getResources().getString(C0966R.string.dmo);
                C87412m.m108593f(string7, "{\n                MMAppl…er_shensui)\n            }");
                return string7;
            case 7:
                String string8 = MMApplicationContext.getContext().getResources().getString(C0966R.string.dmn);
                C87412m.m108593f(string8, "{\n                MMAppl…lter_qiuri)\n            }");
                return string8;
            case 8:
                String string9 = MMApplicationContext.getContext().getResources().getString(C0966R.string.dmk);
                C87412m.m108593f(string9, "{\n                MMAppl…ter_meishi)\n            }");
                return string9;
            case 9:
                String string10 = MMApplicationContext.getContext().getResources().getString(C0966R.string.dme);
                C87412m.m108593f(string10, "{\n                MMAppl…fanchaleng)\n            }");
                return string10;
            default:
                return "";
        }
    }
}
