package p853i4;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: i4.o */
public class C108353o {

    /* renamed from: a */
    public final Map<String, Object> f324391a = new HashMap();

    /* renamed from: b */
    public View f324392b;

    /* renamed from: c */
    public final ArrayList<Transition> f324393c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof C108353o)) {
            return false;
        }
        C108353o oVar = (C108353o) obj;
        return this.f324392b == oVar.f324392b && this.f324391a.equals(oVar.f324391a);
    }

    public int hashCode() {
        return (this.f324392b.hashCode() * 31) + this.f324391a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f324392b + "\n") + "    values:";
        for (String str2 : ((HashMap) this.f324391a).keySet()) {
            str = str + "    " + str2 + ": " + ((HashMap) this.f324391a).get(str2) + "\n";
        }
        return str;
    }
}
