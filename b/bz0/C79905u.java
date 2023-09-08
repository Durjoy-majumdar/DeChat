package bz0;

import android.text.SpannableStringBuilder;
import android.text.style.WrapTogetherSpan;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C8480h;
import gy3.C87412m;
import my3.C34690i;
import my3.C61594j;
import sx3.C36904l0;

/* renamed from: bz0.u */
public final class C79905u implements WrapTogetherSpan {

    /* renamed from: e */
    public static final C79906a f234097e = new C79906a((C8480h) null);

    /* renamed from: d */
    public final long f234098d;

    /* renamed from: bz0.u$a */
    public static final class C79906a {
        public C79906a(C8480h hVar) {
        }

        /* renamed from: a */
        public final long mo110066a(CharSequence charSequence) {
            C79905u[] uVarArr;
            C79905u uVar;
            C87412m.m108594g(charSequence, FirebaseAnalytics.C113379b.SOURCE);
            if (!(charSequence instanceof SpannableStringBuilder) || (uVarArr = (C79905u[]) ((SpannableStringBuilder) charSequence).getSpans(0, charSequence.length(), C79905u.class)) == null) {
                return 0;
            }
            if (uVarArr.length == 0) {
                uVar = null;
            } else {
                C79905u uVar2 = uVarArr[0];
                int length = uVarArr.length - 1;
                if (length != 0) {
                    long j = uVar2.f234098d;
                    C36904l0 i = new C61594j(1, length).iterator();
                    while (((C34690i) i).f93287f) {
                        C79905u uVar3 = uVarArr[i.mo59695a()];
                        long j2 = uVar3.f234098d;
                        if (j < j2) {
                            uVar2 = uVar3;
                            j = j2;
                        }
                    }
                }
                uVar = uVar2;
            }
            if (uVar != null) {
                return uVar.f234098d;
            }
            return 0;
        }
    }

    public C79905u(long j) {
        this.f234098d = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C79905u) && this.f234098d == ((C79905u) obj).f234098d;
    }

    public int hashCode() {
        long j = this.f234098d;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "TimestampSpan(timestamp=" + this.f234098d + ')';
    }
}
