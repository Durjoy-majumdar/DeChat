package androidx.compose.p002ui.platform;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Base64;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p436a1.C103264s0;
import p436a1.C103272w;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104021p;
import p451b2.C104022q;
import p486d2.C106974e;
import p544h2.C108014f;
import p544h2.C32656a;
import p544h2.C32661i;
import p560i2.C33184p;
import p735w1.C111699r;
import p735w1.C37958a;
import sx3.C64197v;

/* renamed from: androidx.compose.ui.platform.k */
public final class C103642k implements C103635j0 {

    /* renamed from: a */
    public final ClipboardManager f306116a;

    public C103642k(Context context) {
        C87412m.m108594g(context, "context");
        Object systemService = context.getSystemService("clipboard");
        if (systemService != null) {
            this.f306116a = (ClipboardManager) systemService;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
    }

    /* renamed from: a */
    public void mo144744a(C37958a aVar) {
        CharSequence charSequence;
        int i;
        long j;
        byte b;
        byte b2;
        C37958a aVar2 = aVar;
        C87412m.m108594g(aVar2, "annotatedString");
        ClipboardManager clipboardManager = this.f306116a;
        if (aVar2.f100414e.isEmpty()) {
            charSequence = aVar2.f100413d;
        } else {
            SpannableString spannableString = new SpannableString(aVar2.f100413d);
            C103702v0 v0Var = new C103702v0();
            List<C37958a.C37961b<C111699r>> list = aVar2.f100414e;
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                C37958a.C37961b bVar = list.get(i2);
                C111699r rVar = (C111699r) bVar.f100426a;
                int i3 = bVar.f100427b;
                int i4 = bVar.f100428c;
                v0Var.f306288a.recycle();
                Parcel obtain = Parcel.obtain();
                C87412m.m108593f(obtain, "obtain()");
                v0Var.f306288a = obtain;
                C87412m.m108594g(rVar, "spanStyle");
                long a = rVar.mo163354a();
                long j2 = C103272w.f304515g;
                if (!C103272w.m136781c(a, j2)) {
                    v0Var.mo144866a((byte) 1);
                    i = i2;
                    v0Var.f306288a.writeLong(rVar.mo163354a());
                } else {
                    i = i2;
                }
                long j3 = rVar.f334342b;
                long j4 = j2;
                long j5 = C33184p.f90062c;
                if (!C33184p.m39968a(j3, j5)) {
                    v0Var.mo144866a((byte) 2);
                    j = j4;
                    v0Var.mo144868c(rVar.f334342b);
                } else {
                    j = j4;
                }
                C104022q qVar = rVar.f334343c;
                if (qVar != null) {
                    v0Var.mo144866a((byte) 3);
                    v0Var.f306288a.writeInt(qVar.f307657d);
                }
                C104020o oVar = rVar.f334344d;
                if (oVar != null) {
                    int i5 = oVar.f307648a;
                    v0Var.mo144866a((byte) 4);
                    if (!(i5 == 0)) {
                        if (i5 == 1) {
                            b2 = 1;
                            v0Var.mo144866a(b2);
                        }
                    }
                    b2 = 0;
                    v0Var.mo144866a(b2);
                }
                C104021p pVar = rVar.f334345e;
                if (pVar != null) {
                    int i6 = pVar.f307649a;
                    v0Var.mo144866a((byte) 5);
                    if (!(i6 == 0)) {
                        b = 1;
                        if (!(i6 == 1)) {
                            if (i6 == 2) {
                                b = 2;
                            } else {
                                if (i6 != 3) {
                                    b = 0;
                                }
                                if (b != 0) {
                                    b = 3;
                                }
                            }
                        }
                        v0Var.mo144866a(b);
                    }
                    b = 0;
                    v0Var.mo144866a(b);
                }
                String str = rVar.f334347g;
                if (str != null) {
                    v0Var.mo144866a((byte) 6);
                    v0Var.f306288a.writeString(str);
                }
                if (!C33184p.m39968a(rVar.f334348h, j5)) {
                    v0Var.mo144866a((byte) 7);
                    v0Var.mo144868c(rVar.f334348h);
                }
                C32656a aVar3 = rVar.f334349i;
                if (aVar3 != null) {
                    float f = aVar3.f86666a;
                    v0Var.mo144866a((byte) 8);
                    v0Var.mo144867b(f);
                }
                C32661i iVar = rVar.f334350j;
                if (iVar != null) {
                    v0Var.mo144866a((byte) 9);
                    v0Var.mo144867b(iVar.f86673a);
                    v0Var.mo144867b(iVar.f86674b);
                }
                if (!C103272w.m136781c(rVar.f334352l, j)) {
                    v0Var.mo144866a((byte) 10);
                    v0Var.f306288a.writeLong(rVar.f334352l);
                }
                C108014f fVar = rVar.f334353m;
                if (fVar != null) {
                    v0Var.mo144866a((byte) 11);
                    v0Var.f306288a.writeInt(fVar.f323460a);
                }
                C103264s0 s0Var = rVar.f334354n;
                if (s0Var != null) {
                    v0Var.mo144866a((byte) 12);
                    v0Var.f306288a.writeLong(s0Var.f304482a);
                    v0Var.mo144867b(C112539e.m153738c(s0Var.f304483b));
                    v0Var.mo144867b(C112539e.m153739d(s0Var.f304483b));
                    v0Var.mo144867b(s0Var.f304484c);
                }
                String encodeToString = Base64.encodeToString(v0Var.f306288a.marshall(), 0);
                C87412m.m108593f(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", encodeToString), i3, i4, 33);
                i2 = i + 1;
            }
            charSequence = spannableString;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }

    public C37958a getText() {
        ClipData primaryClip = this.f306116a.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            CharSequence text = itemAt != null ? itemAt.getText() : null;
            if (text != null) {
                if (!(text instanceof Spanned)) {
                    return new C37958a(text.toString(), (List) null, (List) null, 6, (C8480h) null);
                }
                Spanned spanned = (Spanned) text;
                Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, text.length(), Annotation.class);
                ArrayList arrayList = new ArrayList();
                C87412m.m108593f(annotationArr, "annotations");
                int length = annotationArr.length - 1;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        Annotation annotation = annotationArr[i];
                        if (C87412m.m108589b(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                            int spanStart = spanned.getSpanStart(annotation);
                            int spanEnd = spanned.getSpanEnd(annotation);
                            String value = annotation.getValue();
                            C87412m.m108593f(value, "span.value");
                            C103663m0 m0Var = new C103663m0(value);
                            long j = C103272w.f304515g;
                            long j2 = j;
                            long j3 = C33184p.f90062c;
                            long j4 = j3;
                            C104022q qVar = null;
                            C104020o oVar = null;
                            C104021p pVar = null;
                            String str = null;
                            C32656a aVar = null;
                            C32661i iVar = null;
                            C108014f fVar = null;
                            C103264s0 s0Var = null;
                            while (true) {
                                int i2 = 1;
                                if (m0Var.f306198a.dataAvail() > 1) {
                                    byte readByte = m0Var.f306198a.readByte();
                                    if (readByte != 1) {
                                        if (readByte != 2) {
                                            if (readByte != 3) {
                                                if (readByte != 4) {
                                                    if (readByte != 5) {
                                                        if (readByte != 6) {
                                                            if (readByte != 7) {
                                                                if (readByte != 8) {
                                                                    if (readByte != 9) {
                                                                        if (readByte != 10) {
                                                                            if (readByte != 11) {
                                                                                if (readByte == 12) {
                                                                                    if (m0Var.mo144803a() < 20) {
                                                                                        break;
                                                                                    }
                                                                                    long readLong = m0Var.f306198a.readLong();
                                                                                    int i3 = C103272w.f304516h;
                                                                                    s0Var = new C103264s0(readLong, C112540f.m153745a(m0Var.mo144804b(), m0Var.mo144804b()), m0Var.mo144804b(), (C8480h) null);
                                                                                }
                                                                            } else if (m0Var.mo144803a() < 4) {
                                                                                break;
                                                                            } else {
                                                                                int readInt = m0Var.f306198a.readInt();
                                                                                fVar = C108014f.f323459d;
                                                                                boolean z = (readInt & 2) != 0;
                                                                                C108014f fVar2 = C108014f.f323458c;
                                                                                boolean z2 = (readInt & 1) != 0;
                                                                                if (z && z2) {
                                                                                    List f = C64197v.m75537f(fVar, fVar2);
                                                                                    Integer num = 0;
                                                                                    int size = f.size();
                                                                                    for (int i4 = 0; i4 < size; i4++) {
                                                                                        num = Integer.valueOf(((C108014f) f.get(i4)).f323460a | num.intValue());
                                                                                    }
                                                                                    fVar = new C108014f(num.intValue());
                                                                                } else if (!z) {
                                                                                    fVar = z2 ? fVar2 : C108014f.f323457b;
                                                                                }
                                                                            }
                                                                        } else if (m0Var.mo144803a() < 8) {
                                                                            break;
                                                                        } else {
                                                                            long readLong2 = m0Var.f306198a.readLong();
                                                                            int i5 = C103272w.f304516h;
                                                                            j2 = readLong2;
                                                                        }
                                                                    } else if (m0Var.mo144803a() < 8) {
                                                                        break;
                                                                    } else {
                                                                        iVar = new C32661i(m0Var.mo144804b(), m0Var.mo144804b());
                                                                    }
                                                                } else if (m0Var.mo144803a() < 4) {
                                                                    break;
                                                                } else {
                                                                    aVar = new C32656a(m0Var.mo144804b());
                                                                }
                                                            } else if (m0Var.mo144803a() < 5) {
                                                                break;
                                                            } else {
                                                                j4 = m0Var.mo144805c();
                                                            }
                                                        } else {
                                                            str = m0Var.f306198a.readString();
                                                        }
                                                    } else if (m0Var.mo144803a() < 1) {
                                                        break;
                                                    } else {
                                                        byte readByte2 = m0Var.f306198a.readByte();
                                                        if (readByte2 != 0) {
                                                            if (readByte2 != 1) {
                                                                if (readByte2 == 3) {
                                                                    i2 = 3;
                                                                } else if (readByte2 == 2) {
                                                                    i2 = 2;
                                                                }
                                                            }
                                                            pVar = new C104021p(i2);
                                                        }
                                                        i2 = 0;
                                                        pVar = new C104021p(i2);
                                                    }
                                                } else if (m0Var.mo144803a() < 1) {
                                                    break;
                                                } else {
                                                    byte readByte3 = m0Var.f306198a.readByte();
                                                    if (readByte3 == 0 || readByte3 != 1) {
                                                        i2 = 0;
                                                    }
                                                    oVar = new C104020o(i2);
                                                }
                                            } else if (m0Var.mo144803a() < 4) {
                                                break;
                                            } else {
                                                qVar = new C104022q(m0Var.f306198a.readInt());
                                            }
                                        } else if (m0Var.mo144803a() < 5) {
                                            break;
                                        } else {
                                            j3 = m0Var.mo144805c();
                                        }
                                    } else if (m0Var.mo144803a() < 8) {
                                        break;
                                    } else {
                                        j = m0Var.f306198a.readLong();
                                        int i6 = C103272w.f304516h;
                                    }
                                } else {
                                    break;
                                }
                            }
                            arrayList.add(new C37958a.C37961b(new C111699r(j, j3, qVar, oVar, pVar, (C104014i) null, str, j4, aVar, iVar, (C106974e) null, j2, fVar, s0Var, (C8480h) null), spanStart, spanEnd));
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                return new C37958a(text.toString(), arrayList, (List) null, 4, (C8480h) null);
            }
        }
        return null;
    }
}
