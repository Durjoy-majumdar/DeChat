package gv0;

import com.tencent.p014mm.vfs.C86013q1;
import java.io.InputStream;
import java.util.HashSet;

public class e$$c {

    /* renamed from: a */
    public HashSet<C20849e> f58905a = new HashSet<>();

    /* renamed from: b */
    public String f58906b;

    /* renamed from: c */
    public int f58907c = 0;

    /* renamed from: d */
    public int f58908d = 0;

    /* renamed from: e */
    public InputStream f58909e = null;

    public e$$c(String str) {
        this.f58906b = str;
        int l = (int) C86013q1.m106451l(str);
        this.f58907c = l;
        if (l < 0) {
            this.f58907c = 0;
        }
    }
}
