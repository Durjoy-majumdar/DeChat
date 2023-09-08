package de2;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import de2.C86231c;
import java.util.regex.Pattern;

/* renamed from: de2.d */
public class C31168d implements C86011o1 {

    /* renamed from: a */
    public final /* synthetic */ Pattern f83541a;

    public C31168d(C86231c.C86238g gVar, Pattern pattern) {
        this.f83541a = pattern;
    }

    public boolean accept(C86009m1 m1Var) {
        return this.f83541a.matcher(m1Var.getName()).matches();
    }
}
