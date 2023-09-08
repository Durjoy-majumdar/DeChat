package com.google.protobuf;

import com.google.protobuf.C23803a;
import com.google.protobuf.C23803a.C23804a;
import com.google.protobuf.C23896m1;
import java.nio.charset.Charset;

/* renamed from: com.google.protobuf.i2 */
public class C23844i2<MType extends C23803a, BType extends C23803a.C23804a, IType extends C23896m1> implements C23803a.C23805b {

    /* renamed from: a */
    public C23803a.C23805b f68338a;

    /* renamed from: b */
    public BType f68339b;

    /* renamed from: c */
    public MType f68340c;

    /* renamed from: d */
    public boolean f68341d;

    public C23844i2(MType mtype, C23803a.C23805b bVar, boolean z) {
        Charset charset = C23908o0.f68505a;
        mtype.getClass();
        this.f68340c = mtype;
        this.f68338a = bVar;
        this.f68341d = z;
    }

    /* renamed from: a */
    public void mo37464a() {
        mo37709h();
    }

    /* renamed from: b */
    public MType mo37703b() {
        this.f68341d = true;
        return mo37706e();
    }

    /* renamed from: c */
    public C23844i2<MType, BType, IType> mo37704c() {
        MType mtype = this.f68340c;
        this.f68340c = (C23803a) (mtype != null ? mtype.getDefaultInstanceForType() : this.f68339b.getDefaultInstanceForType());
        BType btype = this.f68339b;
        if (btype != null) {
            btype.dispose();
            this.f68339b = null;
        }
        mo37709h();
        return this;
    }

    /* renamed from: d */
    public BType mo37705d() {
        if (this.f68339b == null) {
            BType btype = (C23803a.C23804a) this.f68340c.newBuilderForType(this);
            this.f68339b = btype;
            btype.mergeFrom((C23836g1) this.f68340c);
            this.f68339b.markClean();
        }
        return this.f68339b;
    }

    /* renamed from: e */
    public MType mo37706e() {
        if (this.f68340c == null) {
            this.f68340c = (C23803a) this.f68339b.buildPartial();
        }
        return this.f68340c;
    }

    /* renamed from: f */
    public IType mo37707f() {
        Object obj = this.f68339b;
        return obj != null ? obj : this.f68340c;
    }

    /* renamed from: g */
    public C23844i2<MType, BType, IType> mo37708g(MType mtype) {
        if (this.f68339b == null) {
            MType mtype2 = this.f68340c;
            if (mtype2 == mtype2.getDefaultInstanceForType()) {
                this.f68340c = mtype;
                mo37709h();
                return this;
            }
        }
        mo37705d().mergeFrom((C23836g1) mtype);
        mo37709h();
        return this;
    }

    /* renamed from: h */
    public final void mo37709h() {
        C23803a.C23805b bVar;
        if (this.f68339b != null) {
            this.f68340c = null;
        }
        if (this.f68341d && (bVar = this.f68338a) != null) {
            bVar.mo37464a();
            this.f68341d = false;
        }
    }

    /* renamed from: i */
    public C23844i2<MType, BType, IType> mo37710i(MType mtype) {
        Charset charset = C23908o0.f68505a;
        mtype.getClass();
        this.f68340c = mtype;
        BType btype = this.f68339b;
        if (btype != null) {
            btype.dispose();
            this.f68339b = null;
        }
        mo37709h();
        return this;
    }
}
