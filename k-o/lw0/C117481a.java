package lw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.math.BigDecimal;
import junit.framework.Assert;

/* renamed from: lw0.a */
public class C117481a {

    /* renamed from: a */
    public int[] f351584a = null;

    public C117481a(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new NullPointerException("null == aDataGroup || 0 == aDataGroup.length");
        }
        this.f351584a = iArr;
    }

    /* renamed from: a */
    public double mo182189a() {
        int[] iArr;
        if (1 == this.f351584a.length) {
            Log.m105918d("MicroMsg.exdevice.GaussianFilter", "data group length = 1, no need to filter, just return");
            iArr = this.f351584a;
        } else {
            StringBuilder sb = new StringBuilder("");
            sb.append("Data Before GaussianFilter \r\n");
            for (int i = 0; i < this.f351584a.length; i++) {
                sb.append(" " + this.f351584a[i]);
            }
            Log.m105918d("MicroMsg.exdevice.GaussianFilter", sb.toString());
            double a = C117485l.m165720a(this.f351584a, 5);
            double c = C117485l.m165722c(this.f351584a, 5);
            double doubleValue = C117485l.m165721b(0.15d, c).add(new BigDecimal(a)).doubleValue();
            double doubleValue2 = C117485l.m165721b(3.09d, c).add(new BigDecimal(a)).doubleValue();
            Log.m105918d("MicroMsg.exdevice.GaussianFilter", "Mean = " + a + "SD = " + c + "LowerLimit = " + doubleValue + " UpperLimit = " + doubleValue2);
            int[] iArr2 = new int[this.f351584a.length];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr3 = this.f351584a;
                if (i2 >= iArr3.length) {
                    break;
                }
                int i4 = iArr3[i2];
                double d = (double) i4;
                if (d >= doubleValue && d <= doubleValue2) {
                    iArr2[i3] = i4;
                    i3++;
                }
                i2++;
            }
            Assert.assertTrue(i3 != 0);
            int[] iArr4 = new int[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                iArr4[i5] = iArr2[i5];
            }
            StringBuilder sb4 = new StringBuilder("");
            sb4.append("Data After GaussianFilter \r\n");
            for (int i6 = 0; i6 < i3; i6++) {
                sb4.append(" " + iArr4[i6]);
            }
            Log.m105918d("MicroMsg.exdevice.GaussianFilter", sb4.toString());
            iArr = iArr4;
        }
        if (iArr != null && iArr.length != 0) {
            return C117485l.m165720a(iArr, 5);
        }
        throw new NullPointerException("null == ret || 0 == ret.length");
    }
}
