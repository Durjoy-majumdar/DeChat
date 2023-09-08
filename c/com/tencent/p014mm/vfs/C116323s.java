package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C116314o;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.s */
public class C116323s extends C116314o.C116317c {

    /* renamed from: l */
    public final Pattern f349092l = Pattern.compile("^\\$\\{dataCache\\}/(?:hws_)?webview_com[_.]tencent[_.]mm(?:_[a-zA-Z0-9_]+)?$");

    public C116323s(String str, int i, int i2, String str2) {
        super(str, i, i2, str2);
    }

    /* renamed from: a */
    public boolean mo177815a(C116314o.C116316b bVar) {
        return bVar.f349056b == 7 && this.f349092l.matcher(bVar.f349058d).matches();
    }
}
