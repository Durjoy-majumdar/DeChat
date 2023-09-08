package com.google.protobuf;

/* renamed from: com.google.protobuf.n2 */
public final class C113385n2 {

    /* renamed from: com.google.protobuf.n2$a */
    public class C113386a implements C113387b {

        /* renamed from: a */
        public final /* synthetic */ C16994k f339243a;

        public C113386a(C16994k kVar) {
            this.f339243a = kVar;
        }

        /* renamed from: a */
        public byte mo169446a(int i) {
            return this.f339243a.mo18738f(i);
        }

        public int size() {
            return this.f339243a.size();
        }
    }

    /* renamed from: com.google.protobuf.n2$b */
    public interface C113387b {
        /* renamed from: a */
        byte mo169446a(int i);

        int size();
    }

    /* renamed from: a */
    public static String m155239a(C16994k kVar) {
        return m155240b(new C113386a(kVar));
    }

    /* renamed from: b */
    public static String m155240b(C113387b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte a = bVar.mo169446a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
