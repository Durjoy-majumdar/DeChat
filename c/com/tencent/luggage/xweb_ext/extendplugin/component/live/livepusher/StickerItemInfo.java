package com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher;

import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import p301cd.C92416i;

public final class StickerItemInfo implements C92416i {

    /* renamed from: a */
    public final int f264605a;

    /* renamed from: b */
    public final String f264606b;

    /* renamed from: c */
    public final int f264607c;

    /* renamed from: d */
    public final TriggerAction f264608d;

    /* renamed from: e */
    public final String f264609e;

    /* renamed from: f */
    public final String f264610f;

    /* renamed from: g */
    public final C28644a f264611g;

    /* renamed from: h */
    public final StickerBackType f264612h;

    /* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$a */
    public static final class C28644a {

        /* renamed from: a */
        public final double f78586a;

        /* renamed from: b */
        public final double f78587b;

        /* renamed from: c */
        public final double f78588c;

        /* renamed from: d */
        public final double f78589d;

        public C28644a(double d, double d2, double d3, double d4) {
            this.f78586a = d;
            this.f78587b = d2;
            this.f78588c = d3;
            this.f78589d = d4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28644a)) {
                return false;
            }
            C28644a aVar = (C28644a) obj;
            return C87412m.m108589b(Double.valueOf(this.f78586a), Double.valueOf(aVar.f78586a)) && C87412m.m108589b(Double.valueOf(this.f78587b), Double.valueOf(aVar.f78587b)) && C87412m.m108589b(Double.valueOf(this.f78588c), Double.valueOf(aVar.f78588c)) && C87412m.m108589b(Double.valueOf(this.f78589d), Double.valueOf(aVar.f78589d));
        }

        public int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.f78586a);
            long doubleToLongBits2 = Double.doubleToLongBits(this.f78587b);
            long doubleToLongBits3 = Double.doubleToLongBits(this.f78588c);
            long doubleToLongBits4 = Double.doubleToLongBits(this.f78589d);
            return (((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
        }

        public String toString() {
            return "Position(x1=" + this.f78586a + ", y1=" + this.f78587b + ", x2=" + this.f78588c + ", y2=" + this.f78589d + ')';
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/luggage/xweb_ext/extendplugin/component/live/livepusher/StickerItemInfo$StickerBackType;", "", "", "jsonVal", "I", "getJsonVal", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "BACKGROUND", "HUMAN_REGION", "luggage-xweb-ext_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    public enum StickerBackType {
        BACKGROUND(0),
        HUMAN_REGION(1);
        
        public static final C92452a Companion = null;
        private final int jsonVal;

        /* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType$a */
        public static final class C92452a {
            public C92452a(C8480h hVar) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new C92452a((C8480h) null);
        }

        private StickerBackType(int i) {
            this.jsonVal = i;
        }

        public static final StickerBackType from(int i) {
            Companion.getClass();
            for (StickerBackType stickerBackType : values()) {
                if (i == stickerBackType.getJsonVal()) {
                    return stickerBackType;
                }
            }
            return null;
        }

        public final int getJsonVal() {
            return this.jsonVal;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, mo182094d2 = {"Lcom/tencent/luggage/xweb_ext/extendplugin/component/live/livepusher/StickerItemInfo$TriggerAction;", "", "", "jsonVal", "I", "getJsonVal", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "DEFAULT_ACTION_LOOP", "FACE_ACTION_MOUTH_OPEN", "FACE_ACTION_MOUTH_KISS", "FACE_ACTION_LEFT_EYE_BLINK", "FACE_ACTION_RIGHT_EYE_BLINK", "FACE_ACTION_EYE_BLINK", "FACE_ACTION_EYEBROW_UP", "FACE_ACTION_HEAD_SHAKE", "FACE_ACTION_HEAD_NOD", "HAND_ACTION_HEART", "HAND_ACTION_PAPER", "HAND_ACTION_SCISSOR", "HAND_ACTION_FIST", "HAND_ACTION_ONE", "HAND_ACTION_LOVE", "HAND_ACTION_LIKE", "HAND_ACTION_OK", "HAND_ACTION_ROCK", "HAND_ACTION_SIX", "HAND_ACTION_EIGHT", "HAND_ACTION_LIFT", "HAND_ACTION_GOOD_FORTUNE", "luggage-xweb-ext_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    public enum TriggerAction {
        DEFAULT_ACTION_LOOP(-1),
        FACE_ACTION_MOUTH_OPEN(10),
        FACE_ACTION_MOUTH_KISS(11),
        FACE_ACTION_LEFT_EYE_BLINK(12),
        FACE_ACTION_RIGHT_EYE_BLINK(13),
        FACE_ACTION_EYE_BLINK(14),
        FACE_ACTION_EYEBROW_UP(15),
        FACE_ACTION_HEAD_SHAKE(16),
        FACE_ACTION_HEAD_NOD(17),
        HAND_ACTION_HEART(100),
        HAND_ACTION_PAPER(101),
        HAND_ACTION_SCISSOR(102),
        HAND_ACTION_FIST(103),
        HAND_ACTION_ONE(104),
        HAND_ACTION_LOVE(105),
        HAND_ACTION_LIKE(106),
        HAND_ACTION_OK(107),
        HAND_ACTION_ROCK(108),
        HAND_ACTION_SIX(109),
        HAND_ACTION_EIGHT(110),
        HAND_ACTION_LIFT(111),
        HAND_ACTION_GOOD_FORTUNE(112);
        
        public static final C92453a Companion = null;
        private final int jsonVal;

        /* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction$a */
        public static final class C92453a {
            public C92453a(C8480h hVar) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new C92453a((C8480h) null);
        }

        private TriggerAction(int i) {
            this.jsonVal = i;
        }

        public static final TriggerAction from(int i) {
            Companion.getClass();
            for (TriggerAction triggerAction : values()) {
                if (i == triggerAction.getJsonVal()) {
                    return triggerAction;
                }
            }
            return null;
        }

        public final int getJsonVal() {
            return this.jsonVal;
        }
    }

    public StickerItemInfo(int i, String str, int i2, TriggerAction triggerAction, String str2, String str3, C28644a aVar, StickerBackType stickerBackType) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(triggerAction, "triggerAction");
        C87412m.m108594g(str2, "resPath");
        C87412m.m108594g(str3, "resPathMd5");
        C87412m.m108594g(stickerBackType, "type");
        this.f264605a = i;
        this.f264606b = str;
        this.f264607c = i2;
        this.f264608d = triggerAction;
        this.f264609e = str2;
        this.f264610f = str3;
        this.f264611g = aVar;
        this.f264612h = stickerBackType;
    }

    /* renamed from: a */
    public String mo21064a() {
        return "StickerItemInfo(resPath='" + this.f264609e + "', resPathMd5='" + this.f264610f + "')";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItemInfo)) {
            return false;
        }
        StickerItemInfo stickerItemInfo = (StickerItemInfo) obj;
        return this.f264605a == stickerItemInfo.f264605a && C87412m.m108589b(this.f264606b, stickerItemInfo.f264606b) && this.f264607c == stickerItemInfo.f264607c && this.f264608d == stickerItemInfo.f264608d && C87412m.m108589b(this.f264609e, stickerItemInfo.f264609e) && C87412m.m108589b(this.f264610f, stickerItemInfo.f264610f) && C87412m.m108589b(this.f264611g, stickerItemInfo.f264611g) && this.f264612h == stickerItemInfo.f264612h;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f264605a * 31) + this.f264606b.hashCode()) * 31) + this.f264607c) * 31) + this.f264608d.hashCode()) * 31) + this.f264609e.hashCode()) * 31) + this.f264610f.hashCode()) * 31;
        C28644a aVar = this.f264611g;
        return ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f264612h.hashCode();
    }

    public String toString() {
        return "StickerItemInfo(id=" + this.f264605a + ", name=" + this.f264606b + ", frameCount=" + this.f264607c + ", triggerAction=" + this.f264608d + ", resPath=" + this.f264609e + ", resPathMd5=" + this.f264610f + ", pos=" + this.f264611g + ", type=" + this.f264612h + ')';
    }
}
