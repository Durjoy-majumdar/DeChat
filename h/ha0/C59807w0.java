package ha0;

import com.tencent.maas.instamovie.base.MJError;

/* renamed from: ha0.w0 */
public final class C59807w0 {

    /* renamed from: a */
    public final MJError f170710a;

    /* renamed from: b */
    public final boolean f170711b;

    /* renamed from: c */
    public final boolean f170712c;

    public C59807w0(MJError mJError) {
        this.f170710a = mJError;
        boolean z = true;
        this.f170711b = mJError == null;
        MJError.MaasEC maasEC = null;
        if ((mJError != null ? mJError.f154609ec : null) != MJError.MaasEC.TimedOut) {
            if ((mJError != null ? mJError.f154609ec : maasEC) != MJError.MaasEC.NetworkFailed) {
                z = false;
            }
        }
        this.f170712c = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MaasRecommendResult(mjError={");
        MJError mJError = this.f170710a;
        String str = null;
        sb.append(mJError != null ? mJError.f154609ec : null);
        sb.append(' ');
        MJError mJError2 = this.f170710a;
        if (mJError2 != null) {
            str = mJError2.message;
        }
        sb.append(str);
        sb.append("}, isSuccess=");
        sb.append(this.f170711b);
        sb.append(", isNetError=");
        sb.append(this.f170712c);
        sb.append(')');
        return sb.toString();
    }
}
