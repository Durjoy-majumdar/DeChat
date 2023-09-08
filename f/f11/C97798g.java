package f11;

import android.view.View;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import com.tencent.p014mm.storage.C72963f4;
import g11.C98065a;
import g11.C98068c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: f11.g */
public class C97798g extends C97796e {

    /* renamed from: f */
    public C68070l.C68072b f286887f;

    /* renamed from: g */
    public String f286888g;

    public C97798g(C92993j jVar, C72963f4 f4Var, String str) {
        super(jVar, f4Var);
    }

    /* renamed from: c */
    public String mo137118c() {
        return mo137136p() != null ? mo137136p().f195602n : "";
    }

    /* renamed from: d */
    public String mo137119d() {
        return mo137136p() != null ? mo137136p().f195570f : "";
    }

    /* renamed from: e */
    public int mo137120e() {
        if (mo137136p() != null) {
            return mo137136p().f195594l;
        }
        return 0;
    }

    /* renamed from: h */
    public int mo137124h() {
        return 1;
    }

    /* renamed from: k */
    public void mo137127k(View view, C97792a aVar) {
        boolean z;
        boolean z2;
        C98065a a = mo137116a();
        long f = mo137122f();
        synchronized (a) {
            Set<Long> set = a.f287514d;
            z = true;
            if (set != null) {
                if (((HashSet) set).contains(Long.valueOf(f))) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (!z2) {
            int i = this.f286881e;
            if (!(i == 4 || i == 5)) {
                z = false;
            }
            if (!z) {
                if (mo137125i()) {
                    C98068c.m126678c(mo137117b(), mo137122f());
                } else {
                    C98068c.m126683h(mo137117b(), mo137116a().f287511a);
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0124, code lost:
        if (r4.equals(com.tencent.xweb.FileReaderHelper.TXT_EXT) != false) goto L_0x0339;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo137126j(f11.C97806o r3, int r4, f11.C97792a r5) {
        /*
            r2 = this;
            super.mo137126j(r3, r4, r5)
            android.widget.TextView r4 = r3.f286908C
            r5 = 0
            r4.setVisibility(r5)
            android.widget.TextView r4 = r3.f286908C
            java.lang.String r0 = r2.mo137119d()
            r4.setText(r0)
            android.widget.TextView r4 = r3.f286909D
            r4.setVisibility(r5)
            android.widget.TextView r4 = r3.f286909D
            int r0 = r2.mo137120e()
            long r0 = (long) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r0)
            r4.setText(r0)
            android.widget.ImageView r3 = r3.f286906A
            java.lang.String r4 = r2.f286888g
            if (r4 != 0) goto L_0x0355
            java.lang.String r4 = r2.mo137118c()
            int r0 = r4.hashCode()
            switch(r0) {
                case -1069324867: goto L_0x032c;
                case -810722925: goto L_0x0320;
                case -284840886: goto L_0x0314;
                case 1827: goto L_0x0309;
                case 3124: goto L_0x02fe;
                case 3169: goto L_0x02f3;
                case 3479: goto L_0x02e7;
                case 3631: goto L_0x02db;
                case 3643: goto L_0x02cf;
                case 3798: goto L_0x02c2;
                case 52316: goto L_0x02b6;
                case 96323: goto L_0x02aa;
                case 96574: goto L_0x029e;
                case 96710: goto L_0x0292;
                case 96790: goto L_0x0286;
                case 96884: goto L_0x027a;
                case 96902: goto L_0x026e;
                case 96980: goto L_0x0262;
                case 97669: goto L_0x0256;
                case 98244: goto L_0x024a;
                case 99453: goto L_0x023e;
                case 99640: goto L_0x0233;
                case 99752: goto L_0x0227;
                case 101488: goto L_0x021b;
                case 102340: goto L_0x020f;
                case 104581: goto L_0x0202;
                case 105439: goto L_0x01f5;
                case 105441: goto L_0x01e8;
                case 106479: goto L_0x01db;
                case 108104: goto L_0x01ce;
                case 108184: goto L_0x01c1;
                case 108230: goto L_0x01b4;
                case 108272: goto L_0x01a7;
                case 108273: goto L_0x019a;
                case 108290: goto L_0x018d;
                case 108322: goto L_0x0180;
                case 110834: goto L_0x0174;
                case 111145: goto L_0x0167;
                case 111220: goto L_0x015b;
                case 112670: goto L_0x014e;
                case 112675: goto L_0x0141;
                case 113252: goto L_0x0135;
                case 114833: goto L_0x0128;
                case 115312: goto L_0x011d;
                case 116079: goto L_0x0110;
                case 116937: goto L_0x0103;
                case 117003: goto L_0x00f6;
                case 117835: goto L_0x00e9;
                case 117856: goto L_0x00dc;
                case 118783: goto L_0x00d0;
                case 120609: goto L_0x00c3;
                case 2993896: goto L_0x00b7;
                case 3088960: goto L_0x00ac;
                case 3259225: goto L_0x009f;
                case 3268712: goto L_0x0092;
                case 3351329: goto L_0x0085;
                case 3358085: goto L_0x0078;
                case 3447940: goto L_0x006b;
                case 3504679: goto L_0x005e;
                case 3530325: goto L_0x0051;
                case 3559925: goto L_0x0044;
                case 3682393: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0338
        L_0x0038:
            java.lang.String r5 = "xlsx"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 6
            goto L_0x0339
        L_0x0044:
            java.lang.String r5 = "tiff"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 47
            goto L_0x0339
        L_0x0051:
            java.lang.String r5 = "silk"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 18
            goto L_0x0339
        L_0x005e:
            java.lang.String r5 = "rmvb"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 42
            goto L_0x0339
        L_0x006b:
            java.lang.String r5 = "pptx"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 8
            goto L_0x0339
        L_0x0078:
            java.lang.String r5 = "mpeg"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 31
            goto L_0x0339
        L_0x0085:
            java.lang.String r5 = "midi"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 22
            goto L_0x0339
        L_0x0092:
            java.lang.String r5 = "jpeg"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 51
            goto L_0x0339
        L_0x009f:
            java.lang.String r5 = "jfif"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 46
            goto L_0x0339
        L_0x00ac:
            java.lang.String r5 = "docx"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 3
            goto L_0x0339
        L_0x00b7:
            java.lang.String r5 = "aiff"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 26
            goto L_0x0339
        L_0x00c3:
            java.lang.String r5 = "zip"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 57
            goto L_0x0339
        L_0x00d0:
            java.lang.String r5 = "xls"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 5
            goto L_0x0339
        L_0x00dc:
            java.lang.String r5 = "wmv"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 38
            goto L_0x0339
        L_0x00e9:
            java.lang.String r5 = "wma"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 19
            goto L_0x0339
        L_0x00f6:
            java.lang.String r5 = "vqf"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 11
            goto L_0x0339
        L_0x0103:
            java.lang.String r5 = "vob"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 30
            goto L_0x0339
        L_0x0110:
            java.lang.String r5 = "url"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 9
            goto L_0x0339
        L_0x011d:
            java.lang.String r0 = "txt"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0338
            goto L_0x0339
        L_0x0128:
            java.lang.String r5 = "tif"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 48
            goto L_0x0339
        L_0x0135:
            java.lang.String r5 = "rtf"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 1
            goto L_0x0339
        L_0x0141:
            java.lang.String r5 = "rar"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 56
            goto L_0x0339
        L_0x014e:
            java.lang.String r5 = "ram"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 45
            goto L_0x0339
        L_0x015b:
            java.lang.String r5 = "ppt"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 7
            goto L_0x0339
        L_0x0167:
            java.lang.String r5 = "png"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 53
            goto L_0x0339
        L_0x0174:
            java.lang.String r5 = "pdf"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 4
            goto L_0x0339
        L_0x0180:
            java.lang.String r5 = "mpe"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 32
            goto L_0x0339
        L_0x018d:
            java.lang.String r5 = "mod"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 14
            goto L_0x0339
        L_0x019a:
            java.lang.String r5 = "mp4"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 41
            goto L_0x0339
        L_0x01a7:
            java.lang.String r5 = "mp3"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 23
            goto L_0x0339
        L_0x01b4:
            java.lang.String r5 = "mmf"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 20
            goto L_0x0339
        L_0x01c1:
            java.lang.String r5 = "mkv"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 37
            goto L_0x0339
        L_0x01ce:
            java.lang.String r5 = "mid"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 21
            goto L_0x0339
        L_0x01db:
            java.lang.String r5 = "m4v"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 29
            goto L_0x0339
        L_0x01e8:
            java.lang.String r5 = "jpg"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 52
            goto L_0x0339
        L_0x01f5:
            java.lang.String r5 = "jpe"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 49
            goto L_0x0339
        L_0x0202:
            java.lang.String r5 = "iso"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 59
            goto L_0x0339
        L_0x020f:
            java.lang.String r5 = "gif"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 55
            goto L_0x0339
        L_0x021b:
            java.lang.String r5 = "flv"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 36
            goto L_0x0339
        L_0x0227:
            java.lang.String r5 = "f4v"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 35
            goto L_0x0339
        L_0x0233:
            java.lang.String r5 = "doc"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 2
            goto L_0x0339
        L_0x023e:
            java.lang.String r5 = "dib"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 50
            goto L_0x0339
        L_0x024a:
            java.lang.String r5 = "cab"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 60
            goto L_0x0339
        L_0x0256:
            java.lang.String r5 = "bmp"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 54
            goto L_0x0339
        L_0x0262:
            java.lang.String r5 = "avi"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 28
            goto L_0x0339
        L_0x026e:
            java.lang.String r5 = "asx"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 33
            goto L_0x0339
        L_0x027a:
            java.lang.String r5 = "asf"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 34
            goto L_0x0339
        L_0x0286:
            java.lang.String r5 = "ape"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 25
            goto L_0x0339
        L_0x0292:
            java.lang.String r5 = "amr"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 17
            goto L_0x0339
        L_0x029e:
            java.lang.String r5 = "aif"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 27
            goto L_0x0339
        L_0x02aa:
            java.lang.String r5 = "aac"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 24
            goto L_0x0339
        L_0x02b6:
            java.lang.String r5 = "3gp"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 40
            goto L_0x0339
        L_0x02c2:
            java.lang.String r5 = "wm"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 39
            goto L_0x0339
        L_0x02cf:
            java.lang.String r5 = "rm"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 43
            goto L_0x0339
        L_0x02db:
            java.lang.String r5 = "ra"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 44
            goto L_0x0339
        L_0x02e7:
            java.lang.String r5 = "md"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 13
            goto L_0x0339
        L_0x02f3:
            java.lang.String r5 = "cd"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 12
            goto L_0x0339
        L_0x02fe:
            java.lang.String r5 = "au"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 16
            goto L_0x0339
        L_0x0309:
            java.lang.String r5 = "7z"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 58
            goto L_0x0339
        L_0x0314:
            java.lang.String r5 = "unknown"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 61
            goto L_0x0339
        L_0x0320:
            java.lang.String r5 = "vorbis"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 15
            goto L_0x0339
        L_0x032c:
            java.lang.String r5 = "mp3pro"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0338
            r5 = 10
            goto L_0x0339
        L_0x0338:
            r5 = -1
        L_0x0339:
            switch(r5) {
                case 0: goto L_0x0351;
                case 1: goto L_0x0351;
                case 2: goto L_0x0351;
                case 3: goto L_0x0351;
                case 4: goto L_0x034e;
                case 5: goto L_0x034b;
                case 6: goto L_0x034b;
                case 7: goto L_0x0348;
                case 8: goto L_0x0348;
                case 9: goto L_0x0345;
                case 10: goto L_0x0342;
                case 11: goto L_0x0342;
                case 12: goto L_0x0342;
                case 13: goto L_0x0342;
                case 14: goto L_0x0342;
                case 15: goto L_0x0342;
                case 16: goto L_0x0342;
                case 17: goto L_0x0342;
                case 18: goto L_0x0342;
                case 19: goto L_0x0342;
                case 20: goto L_0x0342;
                case 21: goto L_0x0342;
                case 22: goto L_0x0342;
                case 23: goto L_0x0342;
                case 24: goto L_0x0342;
                case 25: goto L_0x0342;
                case 26: goto L_0x0342;
                case 27: goto L_0x0342;
                case 28: goto L_0x033f;
                case 29: goto L_0x033f;
                case 30: goto L_0x033f;
                case 31: goto L_0x033f;
                case 32: goto L_0x033f;
                case 33: goto L_0x033f;
                case 34: goto L_0x033f;
                case 35: goto L_0x033f;
                case 36: goto L_0x033f;
                case 37: goto L_0x033f;
                case 38: goto L_0x033f;
                case 39: goto L_0x033f;
                case 40: goto L_0x033f;
                case 41: goto L_0x033f;
                case 42: goto L_0x033f;
                case 43: goto L_0x033f;
                case 44: goto L_0x033f;
                case 45: goto L_0x033f;
                default: goto L_0x033c;
            }
        L_0x033c:
            java.lang.String r4 = "#888888"
            goto L_0x0353
        L_0x033f:
            java.lang.String r4 = "#6781F0"
            goto L_0x0353
        L_0x0342:
            java.lang.String r4 = "#42AA73"
            goto L_0x0353
        L_0x0345:
            java.lang.String r4 = "#33B0D6"
            goto L_0x0353
        L_0x0348:
            java.lang.String r4 = "#ff7a42"
            goto L_0x0353
        L_0x034b:
            java.lang.String r4 = "#278453"
            goto L_0x0353
        L_0x034e:
            java.lang.String r4 = "#c84e3a"
            goto L_0x0353
        L_0x0351:
            java.lang.String r4 = "#3980c1"
        L_0x0353:
            r2.f286888g = r4
        L_0x0355:
            java.lang.String r4 = r2.f286888g
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setBackgroundColor(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f11.C97798g.mo137126j(f11.o, int, f11.a):void");
    }

    /* renamed from: p */
    public final C68070l.C68072b mo137136p() {
        if (this.f286887f == null) {
            this.f286887f = C68070l.C68072b.m80422u(this.f286878b.getContent(), (String) null);
        }
        return this.f286887f;
    }
}
