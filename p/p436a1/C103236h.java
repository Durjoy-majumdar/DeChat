package p436a1;

import android.graphics.Paint;

/* renamed from: a1.h */
public final /* synthetic */ class C103236h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f304444a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f304445b;

    static {
        new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
        int[] iArr = new int[Paint.Cap.values().length];
        iArr[Paint.Cap.BUTT.ordinal()] = 1;
        iArr[Paint.Cap.ROUND.ordinal()] = 2;
        iArr[Paint.Cap.SQUARE.ordinal()] = 3;
        f304444a = iArr;
        int[] iArr2 = new int[Paint.Join.values().length];
        iArr2[Paint.Join.MITER.ordinal()] = 1;
        iArr2[Paint.Join.BEVEL.ordinal()] = 2;
        iArr2[Paint.Join.ROUND.ordinal()] = 3;
        f304445b = iArr2;
    }
}
