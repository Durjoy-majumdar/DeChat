package p994ke;

import com.tencent.p014mm.matrix.C80993l;
import ur3.C90728a;

/* renamed from: ke.a */
public final class C88142a {

    /* renamed from: a */
    public final C90728a f254910a;

    public C88142a(C90728a aVar, C88143a aVar2) {
        this.f254910a = aVar;
    }

    public String toString() {
        return String.format("[IOCanary.IOConfig], main_thread:%b, small_buffer:%b, repeat_read:%b, closeable_leak:%b", new Object[]{Boolean.valueOf(((C80993l) this.f254910a).mo112816c("clicfg_matrix_io_file_io_main_thread_enable", true)), Boolean.valueOf(((C80993l) this.f254910a).mo112816c("clicfg_matrix_io_small_buffer_enable", true)), Boolean.valueOf(((C80993l) this.f254910a).mo112816c("clicfg_matrix_io_repeated_read_enable", true)), Boolean.valueOf(((C80993l) this.f254910a).mo112816c("clicfg_matrix_io_closeable_leak_enable", true))});
    }
}
