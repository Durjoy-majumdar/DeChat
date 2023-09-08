package vy3;

import e04.C20506e;
import gy3.C87412m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import oz3.C21911y;
import sx3.C48501y0;
import sx3.C64175a0;
import sx3.C64197v;
import ty3.C26343l;
import vz3.C22827d;

/* renamed from: vy3.s */
public final class C22807s {

    /* renamed from: a */
    public static final C22807s f65569a = new C22807s();

    /* renamed from: b */
    public static final Set<String> f65570b;

    /* renamed from: c */
    public static final Set<String> f65571c;

    /* renamed from: d */
    public static final Set<String> f65572d;

    /* renamed from: e */
    public static final Set<String> f65573e;

    /* renamed from: f */
    public static final Set<String> f65574f;

    /* renamed from: g */
    public static final Set<String> f65575g;

    static {
        C21911y yVar = C21911y.f61967a;
        f65570b = C48501y0.m53873h(yVar.mo34957d("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        List<C20506e> f = C64197v.m75537f(C20506e.BOOLEAN, C20506e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C20506e eVar : f) {
            String b = eVar.mo32071f().mo35978f().mo35995b();
            C87412m.m108593f(b, "it.wrapperFqName.shortName().asString()");
            String[] strArr = new String[1];
            StringBuilder sb = new StringBuilder();
            String str = eVar.f57724e;
            if (str != null) {
                sb.append(str);
                sb.append("Value()");
                sb.append(eVar.mo32069c());
                strArr[0] = sb.toString();
                C64175a0.m75508p(linkedHashSet, yVar.mo34956c(b, strArr));
            } else {
                C20506e.m22187a(11);
                throw null;
            }
        }
        f65571c = C48501y0.m53872g(C48501y0.m53872g(C48501y0.m53872g(C48501y0.m53872g(C48501y0.m53872g(C48501y0.m53872g(linkedHashSet, yVar.mo34957d("List", "sort(Ljava/util/Comparator;)V")), yVar.mo34956c("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), yVar.mo34956c("Double", "isInfinite()Z", "isNaN()Z")), yVar.mo34956c("Float", "isInfinite()Z", "isNaN()Z")), yVar.mo34956c("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), yVar.mo34956c("CharSequence", "isEmpty()Z"));
        C21911y yVar2 = C21911y.f61967a;
        f65572d = C48501y0.m53872g(C48501y0.m53872g(C48501y0.m53872g(C48501y0.m53872g(C48501y0.m53872g(C48501y0.m53872g(yVar2.mo34956c("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), yVar2.mo34957d("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), yVar2.mo34956c("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), yVar2.mo34956c("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), yVar2.mo34957d("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), yVar2.mo34957d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), yVar2.mo34957d("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f65573e = C48501y0.m53872g(C48501y0.m53872g(yVar2.mo34957d("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), yVar2.mo34957d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), yVar2.mo34957d("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        C20506e eVar2 = C20506e.BYTE;
        List<C20506e> f2 = C64197v.m75537f(C20506e.BOOLEAN, eVar2, C20506e.DOUBLE, C20506e.FLOAT, eVar2, C20506e.INT, C20506e.LONG, C20506e.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (C20506e f3 : f2) {
            String b2 = f3.mo32071f().mo35978f().mo35995b();
            C87412m.m108593f(b2, "it.wrapperFqName.shortName().asString()");
            String[] a = yVar2.mo34954a("Ljava/lang/String;");
            C64175a0.m75508p(linkedHashSet2, yVar2.mo34956c(b2, (String[]) Arrays.copyOf(a, a.length)));
        }
        String[] a2 = yVar2.mo34954a("D");
        Set<T> g = C48501y0.m53872g(linkedHashSet2, yVar2.mo34956c("Float", (String[]) Arrays.copyOf(a2, a2.length)));
        String[] a3 = yVar2.mo34954a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f65574f = C48501y0.m53872g(g, yVar2.mo34956c("String", (String[]) Arrays.copyOf(a3, a3.length)));
        C21911y yVar3 = C21911y.f61967a;
        String[] a4 = yVar3.mo34954a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f65575g = yVar3.mo34956c("Throwable", (String[]) Arrays.copyOf(a4, a4.length));
    }

    /* renamed from: a */
    public final boolean mo35948a(C22827d dVar) {
        C87412m.m108594g(dVar, "fqName");
        if (!C87412m.m108589b(dVar, C26343l.C26344a.f73418h)) {
            return ((HashMap) C26343l.C26344a.f73414d0).get(dVar) != null;
        }
    }
}
