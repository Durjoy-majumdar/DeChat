package su3;

/* renamed from: su3.d */
public final class C26226d {

    /* renamed from: a */
    public final C26229g f73126a;

    public C26226d(C26229g gVar) {
        this.f73126a = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0221, code lost:
        r13 = (r3 >> 8) & 15;
        r1 = (r3 >> 12) & 15;
        r6 = r0.f73126a.mo53111b();
        r3 = r0.f73126a.mo53111b();
        r10 = r3 & 15;
        r11 = (r3 >> 4) & 15;
        r12 = (r3 >> 8) & 15;
        r16 = (r3 >> 12) & 15;
        r17 = su3.C26224b.m33673e(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0247, code lost:
        if (r1 == 0) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0249, code lost:
        if (r1 == 1) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x024b, code lost:
        if (r1 == 2) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x024e, code lost:
        if (r1 == 3) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0250, code lost:
        if (r1 == 4) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0253, code lost:
        if (r1 != 5) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0255, code lost:
        r19.mo53099b(r2, r5, r6, r17, 0, 0, r10, r11, r12, r16, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x028f, code lost:
        throw new pu3.C25488j("bogus registerCount: " + new java.lang.String(new char[]{java.lang.Character.forDigit(r1 & 15, 16)}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0290, code lost:
        r19.mo53100c(r2, r5, r6, r17, 0, 0, r10, r11, r12, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02a5, code lost:
        r19.mo53105h(r2, r5, r6, r17, 0, 0, r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02b8, code lost:
        r19.mo53106i(r2, r5, r6, r17, 0, 0, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02ca, code lost:
        r19.mo53101d(r2, r5, r6, r17, 0, 0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02db, code lost:
        r19.mo53107j(r2, r5, r6, r17, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02eb, code lost:
        r19.mo53101d(r2, r5, r0.f73126a.mo53111b(), su3.C26224b.m33673e(r5), 0, 0, (r3 >> 8) & 255);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0307, code lost:
        r19.mo53106i(r2, r5, r0.f73126a.mo53111b(), su3.C26224b.m33673e(r5), 0, 0, (r3 >> 8) & 15, (r3 >> 12) & 15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0327, code lost:
        r19.mo53103f(r2, r5, r0.f73126a.mo53111b(), su3.C26224b.m33673e(r5), 0, 0, r0.f73126a.mo53111b(), (r3 >> 8) & 255);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0386, code lost:
        r9 = (r3 >> 8) & 255;
        r3 = r0.f73126a.mo53111b();
        r19.mo53105h(r2, r5, 0, 1, 0, 0, r9, r3 & 255, (r3 >> 8) & 255);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x03a8, code lost:
        r19.mo53106i(r2, r5, 0, 1, 0, 0, (r3 >> 8) & 15, (r3 >> 12) & 15);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53110a(su3.C26227e r19) {
        /*
            r18 = this;
            r0 = r18
            r14 = r19
            su3.g r1 = r0.f73126a
            uu3.b r2 = r1.f73122a
            r15 = 0
            r2.f333063f = r15
            r1.f73123b = r15
        L_0x000d:
            su3.g r1 = r0.f73126a
            int r2 = r1.f73123b
            short[] r3 = r1.f73131c
            int r3 = r3.length
            r4 = 1
            if (r2 >= r3) goto L_0x0019
            r3 = 1
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            if (r3 == 0) goto L_0x04b6
            int r3 = r1.mo53111b()
            r5 = r3 & 255(0xff, float:3.57E-43)
            r1 = 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L_0x002b
            if (r5 != r1) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r6 = r5
            goto L_0x002c
        L_0x002b:
            r6 = r3
        L_0x002c:
            r7 = 256(0x100, float:3.59E-43)
            if (r6 == r7) goto L_0x048e
            r7 = 512(0x200, float:7.175E-43)
            if (r6 == r7) goto L_0x045c
            r7 = 768(0x300, float:1.076E-42)
            r8 = 2
            r9 = 4
            r10 = 8
            if (r6 == r7) goto L_0x03c0
            r7 = 16
            switch(r6) {
                case -1: goto L_0x0215;
                case 0: goto L_0x0203;
                case 1: goto L_0x03a8;
                case 2: goto L_0x01e9;
                case 3: goto L_0x01cb;
                case 4: goto L_0x03a8;
                case 5: goto L_0x01e9;
                case 6: goto L_0x01cb;
                case 7: goto L_0x03a8;
                case 8: goto L_0x01e9;
                case 9: goto L_0x01cb;
                case 10: goto L_0x01b7;
                case 11: goto L_0x01b7;
                case 12: goto L_0x01b7;
                case 13: goto L_0x01b7;
                case 14: goto L_0x0203;
                case 15: goto L_0x01b7;
                case 16: goto L_0x01b7;
                case 17: goto L_0x01b7;
                case 18: goto L_0x019c;
                case 19: goto L_0x0182;
                case 20: goto L_0x0169;
                case 21: goto L_0x0147;
                case 22: goto L_0x0182;
                case 23: goto L_0x0169;
                case 24: goto L_0x0130;
                case 25: goto L_0x0147;
                case 26: goto L_0x02eb;
                case 27: goto L_0x0114;
                case 28: goto L_0x02eb;
                case 29: goto L_0x01b7;
                case 30: goto L_0x01b7;
                case 31: goto L_0x02eb;
                case 32: goto L_0x0307;
                case 33: goto L_0x03a8;
                case 34: goto L_0x02eb;
                case 35: goto L_0x0307;
                case 36: goto L_0x0221;
                case 37: goto L_0x0327;
                case 38: goto L_0x00e8;
                case 39: goto L_0x01b7;
                case 40: goto L_0x00d3;
                case 41: goto L_0x00b9;
                case 42: goto L_0x00a0;
                case 43: goto L_0x00e8;
                case 44: goto L_0x00e8;
                case 45: goto L_0x0386;
                case 46: goto L_0x0386;
                case 47: goto L_0x0386;
                case 48: goto L_0x0386;
                case 49: goto L_0x0386;
                case 50: goto L_0x0080;
                case 51: goto L_0x0080;
                case 52: goto L_0x0080;
                case 53: goto L_0x0080;
                case 54: goto L_0x0080;
                case 55: goto L_0x0080;
                case 56: goto L_0x0065;
                case 57: goto L_0x0065;
                case 58: goto L_0x0065;
                case 59: goto L_0x0065;
                case 60: goto L_0x0065;
                case 61: goto L_0x0065;
                default: goto L_0x0041;
            }
        L_0x0041:
            switch(r6) {
                case 68: goto L_0x0386;
                case 69: goto L_0x0386;
                case 70: goto L_0x0386;
                case 71: goto L_0x0386;
                case 72: goto L_0x0386;
                case 73: goto L_0x0386;
                case 74: goto L_0x0386;
                case 75: goto L_0x0386;
                case 76: goto L_0x0386;
                case 77: goto L_0x0386;
                case 78: goto L_0x0386;
                case 79: goto L_0x0386;
                case 80: goto L_0x0386;
                case 81: goto L_0x0386;
                case 82: goto L_0x0307;
                case 83: goto L_0x0307;
                case 84: goto L_0x0307;
                case 85: goto L_0x0307;
                case 86: goto L_0x0307;
                case 87: goto L_0x0307;
                case 88: goto L_0x0307;
                case 89: goto L_0x0307;
                case 90: goto L_0x0307;
                case 91: goto L_0x0307;
                case 92: goto L_0x0307;
                case 93: goto L_0x0307;
                case 94: goto L_0x0307;
                case 95: goto L_0x0307;
                case 96: goto L_0x02eb;
                case 97: goto L_0x02eb;
                case 98: goto L_0x02eb;
                case 99: goto L_0x02eb;
                case 100: goto L_0x02eb;
                case 101: goto L_0x02eb;
                case 102: goto L_0x02eb;
                case 103: goto L_0x02eb;
                case 104: goto L_0x02eb;
                case 105: goto L_0x02eb;
                case 106: goto L_0x02eb;
                case 107: goto L_0x02eb;
                case 108: goto L_0x02eb;
                case 109: goto L_0x02eb;
                case 110: goto L_0x0221;
                case 111: goto L_0x0221;
                case 112: goto L_0x0221;
                case 113: goto L_0x0221;
                case 114: goto L_0x0221;
                default: goto L_0x0044;
            }
        L_0x0044:
            switch(r6) {
                case 116: goto L_0x0327;
                case 117: goto L_0x0327;
                case 118: goto L_0x0327;
                case 119: goto L_0x0327;
                case 120: goto L_0x0327;
                default: goto L_0x0047;
            }
        L_0x0047:
            switch(r6) {
                case 123: goto L_0x03a8;
                case 124: goto L_0x03a8;
                case 125: goto L_0x03a8;
                case 126: goto L_0x03a8;
                case 127: goto L_0x03a8;
                case 128: goto L_0x03a8;
                case 129: goto L_0x03a8;
                case 130: goto L_0x03a8;
                case 131: goto L_0x03a8;
                case 132: goto L_0x03a8;
                case 133: goto L_0x03a8;
                case 134: goto L_0x03a8;
                case 135: goto L_0x03a8;
                case 136: goto L_0x03a8;
                case 137: goto L_0x03a8;
                case 138: goto L_0x03a8;
                case 139: goto L_0x03a8;
                case 140: goto L_0x03a8;
                case 141: goto L_0x03a8;
                case 142: goto L_0x03a8;
                case 143: goto L_0x03a8;
                case 144: goto L_0x0386;
                case 145: goto L_0x0386;
                case 146: goto L_0x0386;
                case 147: goto L_0x0386;
                case 148: goto L_0x0386;
                case 149: goto L_0x0386;
                case 150: goto L_0x0386;
                case 151: goto L_0x0386;
                case 152: goto L_0x0386;
                case 153: goto L_0x0386;
                case 154: goto L_0x0386;
                case 155: goto L_0x0386;
                case 156: goto L_0x0386;
                case 157: goto L_0x0386;
                case 158: goto L_0x0386;
                case 159: goto L_0x0386;
                case 160: goto L_0x0386;
                case 161: goto L_0x0386;
                case 162: goto L_0x0386;
                case 163: goto L_0x0386;
                case 164: goto L_0x0386;
                case 165: goto L_0x0386;
                case 166: goto L_0x0386;
                case 167: goto L_0x0386;
                case 168: goto L_0x0386;
                case 169: goto L_0x0386;
                case 170: goto L_0x0386;
                case 171: goto L_0x0386;
                case 172: goto L_0x0386;
                case 173: goto L_0x0386;
                case 174: goto L_0x0386;
                case 175: goto L_0x0386;
                case 176: goto L_0x03a8;
                case 177: goto L_0x03a8;
                case 178: goto L_0x03a8;
                case 179: goto L_0x03a8;
                case 180: goto L_0x03a8;
                case 181: goto L_0x03a8;
                case 182: goto L_0x03a8;
                case 183: goto L_0x03a8;
                case 184: goto L_0x03a8;
                case 185: goto L_0x03a8;
                case 186: goto L_0x03a8;
                case 187: goto L_0x03a8;
                case 188: goto L_0x03a8;
                case 189: goto L_0x03a8;
                case 190: goto L_0x03a8;
                case 191: goto L_0x03a8;
                case 192: goto L_0x03a8;
                case 193: goto L_0x03a8;
                case 194: goto L_0x03a8;
                case 195: goto L_0x03a8;
                case 196: goto L_0x03a8;
                case 197: goto L_0x03a8;
                case 198: goto L_0x03a8;
                case 199: goto L_0x03a8;
                case 200: goto L_0x03a8;
                case 201: goto L_0x03a8;
                case 202: goto L_0x03a8;
                case 203: goto L_0x03a8;
                case 204: goto L_0x03a8;
                case 205: goto L_0x03a8;
                case 206: goto L_0x03a8;
                case 207: goto L_0x03a8;
                case 208: goto L_0x0368;
                case 209: goto L_0x0368;
                case 210: goto L_0x0368;
                case 211: goto L_0x0368;
                case 212: goto L_0x0368;
                case 213: goto L_0x0368;
                case 214: goto L_0x0368;
                case 215: goto L_0x0368;
                case 216: goto L_0x0349;
                case 217: goto L_0x0349;
                case 218: goto L_0x0349;
                case 219: goto L_0x0349;
                case 220: goto L_0x0349;
                case 221: goto L_0x0349;
                case 222: goto L_0x0349;
                case 223: goto L_0x0349;
                case 224: goto L_0x0349;
                case 225: goto L_0x0349;
                case 226: goto L_0x0349;
                default: goto L_0x004a;
            }
        L_0x004a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown opcode: "
            r2.append(r3)
            java.lang.String r3 = tu3.C26312a.m33786d(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0065:
            int r3 = r3 >> 8
            r9 = r3 & 255(0xff, float:3.57E-43)
            su3.g r1 = r0.f73126a
            int r1 = r1.mo53111b()
            short r1 = (short) r1
            r4 = 0
            r6 = 1
            int r7 = r2 + r1
            r10 = 0
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r1.mo53101d(r2, r3, r4, r5, r6, r7, r9)
            goto L_0x000d
        L_0x0080:
            int r1 = r3 >> 8
            r9 = r1 & 15
            int r1 = r3 >> 12
            r10 = r1 & 15
            su3.g r1 = r0.f73126a
            int r1 = r1.mo53111b()
            short r1 = (short) r1
            r4 = 0
            r6 = 1
            int r7 = r2 + r1
            r11 = 0
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r1.mo53106i(r2, r3, r4, r5, r6, r7, r9, r10)
            goto L_0x000d
        L_0x00a0:
            int r3 = r3 >> 8
            r1 = r1 & r3
            su3.g r3 = r0.f73126a
            int r3 = r3.mo53112c()
            r4 = 0
            r6 = 1
            int r7 = r2 + r3
            long r8 = (long) r1
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r1.mo53107j(r2, r3, r4, r5, r6, r7)
            goto L_0x000d
        L_0x00b9:
            int r3 = r3 >> 8
            r1 = r1 & r3
            su3.g r3 = r0.f73126a
            int r3 = r3.mo53111b()
            short r3 = (short) r3
            r4 = 0
            r6 = 1
            int r7 = r2 + r3
            long r8 = (long) r1
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r1.mo53107j(r2, r3, r4, r5, r6, r7)
            goto L_0x000d
        L_0x00d3:
            int r3 = r3 >> 8
            r1 = r1 & r3
            byte r1 = (byte) r1
            r4 = 0
            r6 = 1
            int r7 = r2 + r1
            r8 = 0
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r1.mo53107j(r2, r3, r4, r5, r6, r7)
            goto L_0x000d
        L_0x00e8:
            int r3 = r3 >> 8
            r9 = r3 & 255(0xff, float:3.57E-43)
            su3.g r1 = r0.f73126a
            int r1 = r1.mo53112c()
            int r6 = r2 + r1
            r1 = 43
            if (r5 == r1) goto L_0x00fd
            r1 = 44
            if (r5 == r1) goto L_0x00fd
            goto L_0x0106
        L_0x00fd:
            su3.g r1 = r0.f73126a
            int r3 = r6 + 1
            uu3.b r1 = r1.f73122a
            r1.mo162980f(r3, r2)
        L_0x0106:
            r4 = 0
            r7 = 1
            r10 = 0
            r1 = r19
            r3 = r5
            r5 = r7
            r7 = r10
            r1.mo53101d(r2, r3, r4, r5, r6, r7, r9)
            goto L_0x000d
        L_0x0114:
            int r3 = r3 >> 8
            r9 = r3 & 255(0xff, float:3.57E-43)
            su3.g r1 = r0.f73126a
            int r4 = r1.mo53112c()
            int r6 = su3.C26224b.m33673e(r5)
            r7 = 0
            r10 = 0
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r1.mo53101d(r2, r3, r4, r5, r6, r7, r9)
            goto L_0x000d
        L_0x0130:
            int r3 = r3 >> 8
            r9 = r3 & 255(0xff, float:3.57E-43)
            su3.g r1 = r0.f73126a
            long r7 = r1.mo53113d()
            r4 = 0
            r6 = 1
            r10 = 0
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r10
            r1.mo53101d(r2, r3, r4, r5, r6, r7, r9)
            goto L_0x000d
        L_0x0147:
            int r3 = r3 >> 8
            r9 = r3 & 255(0xff, float:3.57E-43)
            su3.g r1 = r0.f73126a
            int r1 = r1.mo53111b()
            short r1 = (short) r1
            long r3 = (long) r1
            r1 = 21
            if (r5 != r1) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r7 = 48
        L_0x015a:
            long r7 = r3 << r7
            r4 = 0
            r6 = 1
            r10 = 0
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r10
            r1.mo53101d(r2, r3, r4, r5, r6, r7, r9)
            goto L_0x000d
        L_0x0169:
            int r3 = r3 >> 8
            r9 = r3 & 255(0xff, float:3.57E-43)
            su3.g r1 = r0.f73126a
            int r1 = r1.mo53112c()
            r4 = 0
            r6 = 1
            r7 = 0
            long r10 = (long) r1
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r1.mo53101d(r2, r3, r4, r5, r6, r7, r9)
            goto L_0x000d
        L_0x0182:
            int r3 = r3 >> 8
            r9 = r3 & 255(0xff, float:3.57E-43)
            su3.g r1 = r0.f73126a
            int r1 = r1.mo53111b()
            short r1 = (short) r1
            r4 = 0
            r6 = 1
            r7 = 0
            long r10 = (long) r1
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r1.mo53101d(r2, r3, r4, r5, r6, r7, r9)
            goto L_0x000d
        L_0x019c:
            int r1 = r3 >> 8
            r9 = r1 & 15
            int r1 = r3 >> 12
            r1 = r1 & 15
            int r1 = r1 << 28
            int r1 = r1 >> 28
            r4 = 0
            r6 = 1
            r7 = 0
            long r10 = (long) r1
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r1.mo53101d(r2, r3, r4, r5, r6, r7, r9)
            goto L_0x000d
        L_0x01b7:
            int r3 = r3 >> 8
            r9 = r3 & 255(0xff, float:3.57E-43)
            r4 = 0
            r6 = 1
            r7 = 0
            r10 = 0
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r1.mo53101d(r2, r3, r4, r5, r6, r7, r9)
            goto L_0x000d
        L_0x01cb:
            int r3 = r3 >> 8
            r1 = r1 & r3
            su3.g r3 = r0.f73126a
            int r9 = r3.mo53111b()
            su3.g r3 = r0.f73126a
            int r10 = r3.mo53111b()
            r4 = 0
            r6 = 1
            r7 = 0
            long r11 = (long) r1
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r1.mo53106i(r2, r3, r4, r5, r6, r7, r9, r10)
            goto L_0x000d
        L_0x01e9:
            int r3 = r3 >> 8
            r9 = r3 & 255(0xff, float:3.57E-43)
            su3.g r1 = r0.f73126a
            int r10 = r1.mo53111b()
            r4 = 0
            r6 = 1
            r7 = 0
            r11 = 0
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r1.mo53106i(r2, r3, r4, r5, r6, r7, r9, r10)
            goto L_0x000d
        L_0x0203:
            int r3 = r3 >> 8
            r1 = r1 & r3
            r4 = 0
            r6 = 1
            r7 = 0
            long r8 = (long) r1
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r1.mo53107j(r2, r3, r4, r5, r6, r7)
            goto L_0x000d
        L_0x0215:
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 0
            r1 = r19
            r1.mo53107j(r2, r3, r4, r5, r6, r7)
            goto L_0x000d
        L_0x0221:
            int r1 = r3 >> 8
            r13 = r1 & 15
            int r1 = r3 >> 12
            r1 = r1 & 15
            su3.g r3 = r0.f73126a
            int r6 = r3.mo53111b()
            su3.g r3 = r0.f73126a
            int r3 = r3.mo53111b()
            r10 = r3 & 15
            int r11 = r3 >> 4
            r11 = r11 & 15
            int r12 = r3 >> 8
            r12 = r12 & 15
            int r3 = r3 >> 12
            r16 = r3 & 15
            int r17 = su3.C26224b.m33673e(r5)
            if (r1 == 0) goto L_0x02db
            if (r1 == r4) goto L_0x02ca
            if (r1 == r8) goto L_0x02b8
            r3 = 3
            if (r1 == r3) goto L_0x02a5
            if (r1 == r9) goto L_0x0290
            r3 = 5
            if (r1 != r3) goto L_0x026a
            r7 = 0
            r8 = 0
            r1 = r19
            r3 = r5
            r4 = r6
            r5 = r17
            r6 = r7
            r7 = r8
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r16
            r1.mo53099b(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13)
            goto L_0x000d
        L_0x026a:
            pu3.j r2 = new pu3.j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "bogus registerCount: "
            r3.append(r5)
            char[] r4 = new char[r4]
            r1 = r1 & 15
            char r1 = java.lang.Character.forDigit(r1, r7)
            r4[r15] = r1
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>((java.lang.String) r1)
            throw r2
        L_0x0290:
            r7 = 0
            r8 = 0
            r1 = r19
            r3 = r5
            r4 = r6
            r5 = r17
            r6 = r7
            r7 = r8
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r16
            r1.mo53100c(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
            goto L_0x000d
        L_0x02a5:
            r7 = 0
            r8 = 0
            r1 = r19
            r3 = r5
            r4 = r6
            r5 = r17
            r6 = r7
            r7 = r8
            r9 = r10
            r10 = r11
            r11 = r12
            r1.mo53105h(r2, r3, r4, r5, r6, r7, r9, r10, r11)
            goto L_0x000d
        L_0x02b8:
            r7 = 0
            r8 = 0
            r1 = r19
            r3 = r5
            r4 = r6
            r5 = r17
            r6 = r7
            r7 = r8
            r9 = r10
            r10 = r11
            r1.mo53106i(r2, r3, r4, r5, r6, r7, r9, r10)
            goto L_0x000d
        L_0x02ca:
            r7 = 0
            r8 = 0
            r1 = r19
            r3 = r5
            r4 = r6
            r5 = r17
            r6 = r7
            r7 = r8
            r9 = r10
            r1.mo53101d(r2, r3, r4, r5, r6, r7, r9)
            goto L_0x000d
        L_0x02db:
            r7 = 0
            r8 = 0
            r1 = r19
            r3 = r5
            r4 = r6
            r5 = r17
            r6 = r7
            r7 = r8
            r1.mo53107j(r2, r3, r4, r5, r6, r7)
            goto L_0x000d
        L_0x02eb:
            int r3 = r3 >> 8
            r9 = r3 & 255(0xff, float:3.57E-43)
            su3.g r1 = r0.f73126a
            int r4 = r1.mo53111b()
            int r6 = su3.C26224b.m33673e(r5)
            r7 = 0
            r10 = 0
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r1.mo53101d(r2, r3, r4, r5, r6, r7, r9)
            goto L_0x000d
        L_0x0307:
            int r1 = r3 >> 8
            r9 = r1 & 15
            int r1 = r3 >> 12
            r10 = r1 & 15
            su3.g r1 = r0.f73126a
            int r4 = r1.mo53111b()
            int r6 = su3.C26224b.m33673e(r5)
            r7 = 0
            r11 = 0
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r1.mo53106i(r2, r3, r4, r5, r6, r7, r9, r10)
            goto L_0x000d
        L_0x0327:
            int r3 = r3 >> 8
            r10 = r3 & 255(0xff, float:3.57E-43)
            su3.g r1 = r0.f73126a
            int r4 = r1.mo53111b()
            su3.g r1 = r0.f73126a
            int r9 = r1.mo53111b()
            int r6 = su3.C26224b.m33673e(r5)
            r7 = 0
            r11 = 0
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r1.mo53103f(r2, r3, r4, r5, r6, r7, r9, r10)
            goto L_0x000d
        L_0x0349:
            int r3 = r3 >> 8
            r9 = r3 & 255(0xff, float:3.57E-43)
            su3.g r3 = r0.f73126a
            int r3 = r3.mo53111b()
            r11 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 >> r10
            r1 = r1 & r3
            byte r1 = (byte) r1
            r4 = 0
            r6 = 1
            r7 = 0
            long r12 = (long) r1
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r12
            r10 = r11
            r1.mo53106i(r2, r3, r4, r5, r6, r7, r9, r10)
            goto L_0x000d
        L_0x0368:
            int r1 = r3 >> 8
            r9 = r1 & 15
            int r1 = r3 >> 12
            r10 = r1 & 15
            su3.g r1 = r0.f73126a
            int r1 = r1.mo53111b()
            short r1 = (short) r1
            r4 = 0
            r6 = 1
            r7 = 0
            long r11 = (long) r1
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r1.mo53106i(r2, r3, r4, r5, r6, r7, r9, r10)
            goto L_0x000d
        L_0x0386:
            int r3 = r3 >> 8
            r9 = r3 & 255(0xff, float:3.57E-43)
            su3.g r3 = r0.f73126a
            int r3 = r3.mo53111b()
            r11 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 >> r10
            r12 = r3 & 255(0xff, float:3.57E-43)
            r4 = 0
            r6 = 1
            r7 = 0
            r16 = 0
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r16
            r10 = r11
            r11 = r12
            r1.mo53105h(r2, r3, r4, r5, r6, r7, r9, r10, r11)
            goto L_0x000d
        L_0x03a8:
            int r1 = r3 >> 8
            r9 = r1 & 15
            int r1 = r3 >> 12
            r10 = r1 & 15
            r4 = 0
            r6 = 1
            r7 = 0
            r11 = 0
            r1 = r19
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r1.mo53106i(r2, r3, r4, r5, r6, r7, r9, r10)
            goto L_0x000d
        L_0x03c0:
            su3.g r1 = r0.f73126a
            int r1 = r1.mo53111b()
            su3.g r5 = r0.f73126a
            int r5 = r5.mo53112c()
            if (r1 == r4) goto L_0x0439
            if (r1 == r8) goto L_0x0420
            if (r1 == r9) goto L_0x0408
            if (r1 != r10) goto L_0x03ed
            long[] r4 = new long[r5]
            r1 = 0
        L_0x03d7:
            if (r1 >= r5) goto L_0x03e4
            su3.g r6 = r0.f73126a
            long r6 = r6.mo53113d()
            r4[r1] = r6
            int r1 = r1 + 1
            goto L_0x03d7
        L_0x03e4:
            r6 = 8
            r1 = r19
            r1.mo53098a(r2, r3, r4, r5, r6)
            goto L_0x000d
        L_0x03ed:
            pu3.j r2 = new pu3.j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "bogus element_width: "
            r3.append(r4)
            java.lang.String r1 = tu3.C26312a.m33784b(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>((java.lang.String) r1)
            throw r2
        L_0x0408:
            int[] r4 = new int[r5]
            r1 = 0
        L_0x040b:
            if (r1 >= r5) goto L_0x0418
            su3.g r6 = r0.f73126a
            int r6 = r6.mo53112c()
            r4[r1] = r6
            int r1 = r1 + 1
            goto L_0x040b
        L_0x0418:
            r6 = 4
            r1 = r19
            r1.mo53098a(r2, r3, r4, r5, r6)
            goto L_0x000d
        L_0x0420:
            short[] r4 = new short[r5]
            r1 = 0
        L_0x0423:
            if (r1 >= r5) goto L_0x0431
            su3.g r6 = r0.f73126a
            int r6 = r6.mo53111b()
            short r6 = (short) r6
            r4[r1] = r6
            int r1 = r1 + 1
            goto L_0x0423
        L_0x0431:
            r6 = 2
            r1 = r19
            r1.mo53098a(r2, r3, r4, r5, r6)
            goto L_0x000d
        L_0x0439:
            byte[] r6 = new byte[r5]
            r1 = 0
            r7 = 0
        L_0x043d:
            if (r1 >= r5) goto L_0x0452
            if (r4 == 0) goto L_0x0447
            su3.g r7 = r0.f73126a
            int r7 = r7.mo53111b()
        L_0x0447:
            r8 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r6[r1] = r8
            int r7 = r7 >> r10
            int r1 = r1 + 1
            r4 = r4 ^ 1
            goto L_0x043d
        L_0x0452:
            r7 = 1
            r1 = r19
            r4 = r6
            r6 = r7
            r1.mo53098a(r2, r3, r4, r5, r6)
            goto L_0x000d
        L_0x045c:
            su3.g r1 = r0.f73126a
            int r1 = r1.mo53097a()
            su3.g r4 = r0.f73126a
            int r4 = r4.mo53111b()
            int[] r5 = new int[r4]
            int[] r6 = new int[r4]
            r7 = 0
        L_0x046d:
            if (r7 >= r4) goto L_0x047a
            su3.g r8 = r0.f73126a
            int r8 = r8.mo53112c()
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x046d
        L_0x047a:
            r7 = 0
        L_0x047b:
            if (r7 >= r4) goto L_0x0489
            su3.g r8 = r0.f73126a
            int r8 = r8.mo53112c()
            int r8 = r8 + r1
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x047b
        L_0x0489:
            r14.mo53104g(r2, r3, r5, r6)
            goto L_0x000d
        L_0x048e:
            su3.g r1 = r0.f73126a
            int r1 = r1.mo53097a()
            su3.g r4 = r0.f73126a
            int r4 = r4.mo53111b()
            su3.g r5 = r0.f73126a
            int r5 = r5.mo53112c()
            int[] r6 = new int[r4]
            r7 = 0
        L_0x04a3:
            if (r7 >= r4) goto L_0x04b1
            su3.g r8 = r0.f73126a
            int r8 = r8.mo53112c()
            int r8 = r8 + r1
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x04a3
        L_0x04b1:
            r14.mo53102e(r2, r3, r5, r6)
            goto L_0x000d
        L_0x04b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su3.C26226d.mo53110a(su3.e):void");
    }
}
