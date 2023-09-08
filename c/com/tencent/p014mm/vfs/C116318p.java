package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C116314o;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.p */
public class C116318p extends C116314o.C116317c {

    /* renamed from: l */
    public final Pattern f349078l = Pattern.compile("^\\$\\{data\\}/app_xwalk_[\\-0-9]*$");

    public C116318p(String str, int i, int i2, String str2) {
        super(str, i, i2, str2);
    }

    /* renamed from: a */
    public boolean mo177815a(C116314o.C116316b bVar) {
        return bVar.f349056b == 7 && this.f349078l.matcher(bVar.f349058d).matches();
    }
}
