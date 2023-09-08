package n60;

import com.tencent.p014mm.loader.cache.memory.C92699b;
import com.tencent.p014mm.loader.cache.memory.DefaultMemoryCache;
import gy3.C87412m;
import m60.C99792d;
import n60.C100075f;
import o60.C100284b;
import o60.C100291e;
import o60.C100292f;
import p60.C100632a;
import p60.C100635c;
import p60.C100637g;
import p60.C100638i;
import s60.C101535a;
import s60.C101536b;
import t60.C101724f;
import t60.C101725g;
import t60.C13831b;
import u60.C65220d;
import u60.C65222f;

/* renamed from: n60.c */
public class C100072c<T, R> {

    /* renamed from: a */
    public C100075f f293143a = new C100075f.C100076a().mo139398a();

    /* renamed from: b */
    public C92699b<T, R> f293144b = new DefaultMemoryCache();

    /* renamed from: c */
    public C99792d<T, R> f293145c;

    /* renamed from: d */
    public C100284b<T> f293146d;

    /* renamed from: e */
    public C101725g f293147e = new C100632a();

    /* renamed from: f */
    public C100291e<R> f293148f;

    /* renamed from: g */
    public C101535a<R> f293149g;

    /* renamed from: h */
    public C100292f f293150h = new C100637g();

    /* renamed from: i */
    public C13831b f293151i = new C100635c();

    /* renamed from: j */
    public C101724f f293152j = new C100638i();

    /* renamed from: k */
    public C65222f<C65220d> f293153k;

    /* renamed from: a */
    public final C100072c<T, R> mo139396a(C101536b<R> bVar) {
        C87412m.m108594g(bVar, "transcoder");
        C101535a<R> aVar = this.f293149g;
        if (aVar == null) {
            this.f293149g = new C101535a<>(bVar);
        } else if (aVar != null) {
            aVar.mo141015c(bVar);
        }
        return this;
    }

    /* renamed from: b */
    public final C100072c<T, R> mo139397b(C100075f fVar) {
        C87412m.m108594g(fVar, "options");
        this.f293143a = fVar;
        return this;
    }
}
