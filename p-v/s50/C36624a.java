package s50;

import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: s50.a */
public final class C36624a {

    /* renamed from: a */
    public final HashMap<Integer, Integer> f97362a;

    /* renamed from: b */
    public boolean f97363b;

    public C36624a() {
        this((HashMap) null, 1, (C8480h) null);
    }

    public C36624a(HashMap<Integer, Integer> hashMap, int i, C8480h hVar) {
        hashMap = (i & 1) != 0 ? new HashMap<>() : hashMap;
        C87412m.m108594g(hashMap, "configMap");
        this.f97362a = hashMap;
        this.f97363b = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36624a) && C87412m.m108589b(this.f97362a, ((C36624a) obj).f97362a);
    }

    public int hashCode() {
        return this.f97362a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BeautyConfig(isNewSmoothFace=");
        sb.append(this.f97363b);
        sb.append(", skinSmooth=");
        Integer num = this.f97362a.get(0);
        int i = -1;
        sb.append(num == null ? -1 : num.intValue());
        sb.append(", eyeMorph=");
        Integer num2 = this.f97362a.get(4);
        sb.append(num2 == null ? -1 : num2.intValue());
        sb.append(", faceMorph=");
        Integer num3 = this.f97362a.get(1);
        sb.append(num3 == null ? -1 : num3.intValue());
        sb.append(", skinBright=");
        Integer num4 = this.f97362a.get(2);
        sb.append(num4 == null ? -1 : num4.intValue());
        sb.append(", eyeBright=");
        Integer num5 = this.f97362a.get(5);
        sb.append(num5 == null ? -1 : num5.intValue());
        sb.append(", rosy=");
        Integer num6 = this.f97362a.get(3);
        sb.append(num6 == null ? -1 : num6.intValue());
        sb.append(", eyePouch=");
        Integer num7 = this.f97362a.get(6);
        sb.append(num7 == null ? -1 : num7.intValue());
        sb.append(", smileFolds=");
        Integer num8 = this.f97362a.get(7);
        sb.append(num8 == null ? -1 : num8.intValue());
        sb.append(", sharpen=");
        Integer num9 = this.f97362a.get(8);
        sb.append(num9 == null ? -1 : num9.intValue());
        sb.append(", teethBright=");
        Integer num10 = this.f97362a.get(9);
        sb.append(num10 == null ? -1 : num10.intValue());
        sb.append(", smallHead=");
        Integer num11 = this.f97362a.get(10);
        sb.append(num11 == null ? -1 : num11.intValue());
        sb.append(", cheekBone=");
        Integer num12 = this.f97362a.get(11);
        sb.append(num12 == null ? -1 : num12.intValue());
        sb.append(", jawBone=");
        Integer num13 = this.f97362a.get(12);
        sb.append(num13 == null ? -1 : num13.intValue());
        sb.append(", wingOfNose=");
        Integer num14 = this.f97362a.get(13);
        sb.append(num14 == null ? -1 : num14.intValue());
        sb.append(", bigEye=");
        Integer num15 = this.f97362a.get(14);
        sb.append(num15 == null ? -1 : num15.intValue());
        sb.append(", chin=");
        Integer num16 = this.f97362a.get(15);
        sb.append(num16 == null ? -1 : num16.intValue());
        sb.append(", mouthMorph=");
        Integer num17 = this.f97362a.get(16);
        sb.append(num17 == null ? -1 : num17.intValue());
        sb.append(", hairLine=");
        Integer num18 = this.f97362a.get(17);
        sb.append(num18 == null ? -1 : num18.intValue());
        sb.append(", boySlim=");
        Integer num19 = this.f97362a.get(18);
        sb.append(num19 == null ? -1 : num19.intValue());
        sb.append(", girlSlim=");
        Integer num20 = this.f97362a.get(19);
        sb.append(num20 == null ? -1 : num20.intValue());
        sb.append(", zhaiLian=");
        Integer num21 = this.f97362a.get(20);
        sb.append(num21 == null ? -1 : num21.intValue());
        sb.append(", contour=");
        Integer num22 = this.f97362a.get(21);
        if (num22 != null) {
            i = num22.intValue();
        }
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }
}
