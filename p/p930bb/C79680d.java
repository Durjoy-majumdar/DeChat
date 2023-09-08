package p930bb;

import com.tencent.p014mm.sdk.platformtools.Log;
import p1030s6.C90132b;
import p930bb.C79680d.C79681a;

/* renamed from: bb.d */
public abstract class C79680d<T extends C79681a> implements C90132b {

    /* renamed from: bb.d$a */
    public interface C79681a {
        /* renamed from: a */
        String mo109477a();
    }

    /* renamed from: bb.d$b */
    public interface C79682b extends C79681a {
    }

    /* renamed from: bb.d$c */
    public interface C79683c extends C79681a {
    }

    /* renamed from: bb.d$d */
    public interface C79684d extends C79681a {
    }

    public C79680d(T t) {
        Log.m105925i("MicroMsg.BaseImageStreamFetcherWxa", "hy: construct fetcher with config %s env %s", t.getClass().getSimpleName(), t.mo109477a());
    }
}
