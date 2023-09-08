package androidx.window.core;

import fy3.C32224a;
import gy3.C87413o;
import java.math.BigInteger;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, mo182094d2 = {"Ljava/math/BigInteger;", "kotlin.jvm.PlatformType", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 5, 1})
public final class Version$bigInteger$2 extends C87413o implements C32224a<BigInteger> {
    public final /* synthetic */ Version this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Version$bigInteger$2(Version version) {
        super(0);
        this.this$0 = version;
    }

    public final BigInteger invoke() {
        return BigInteger.valueOf((long) this.this$0.getMajor()).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.getMinor())).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.getPatch()));
    }
}
