package p593l5;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;

/* renamed from: l5.c */
public final class C34178c implements C109269b<Integer, Uri> {

    /* renamed from: a */
    public final Context f92189a;

    public C34178c(Context context) {
        C87412m.m108594g(context, "context");
        this.f92189a = context;
    }

    /* renamed from: a */
    public boolean mo59477a(Object obj) {
        try {
            return this.f92189a.getResources().getResourceEntryName(((Number) obj).intValue()) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public Object mo59478f(Object obj) {
        int intValue = ((Number) obj).intValue();
        Uri parse = Uri.parse("android.resource://" + this.f92189a.getPackageName() + XVFSFile.SEPARATOR_CHAR + intValue);
        C87412m.m108593f(parse, "parse(this)");
        return parse;
    }
}
