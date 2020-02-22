/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package de.cofinpro.intellij.acfeplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementType;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>FormulaEngine.flex</tt>
 */
public class FormulaEngineLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1040 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\177\200");

  /* The ZZ_CMAP_A table has 256 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\1\1\6\1\0\1\1\1\6\22\0\1\1\1\25\1\7\1\0\1\52\1\24\1\20\1\4\1\12\1"+
    "\13\1\11\1\22\1\66\2\0\1\10\12\3\1\0\1\67\1\23\1\21\3\0\1\54\2\2\1\57\11\2"+
    "\1\53\1\56\4\2\1\55\4\2\1\60\1\2\1\16\1\5\1\17\1\0\1\63\1\0\1\32\1\34\1\31"+
    "\1\44\1\41\1\35\1\33\1\51\1\37\1\2\1\64\1\27\1\61\1\40\1\30\1\62\1\47\1\42"+
    "\1\43\1\36\1\46\1\65\1\50\1\2\1\45\1\2\1\14\1\26\1\15\202\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\1"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\1\1\15"+
    "\1\16\1\17\1\20\1\21\1\1\14\3\1\1\1\3"+
    "\1\22\1\23\2\5\2\6\1\24\1\0\1\25\1\26"+
    "\1\27\1\30\1\31\13\3\1\32\12\3\2\0\1\3"+
    "\1\0\6\3\1\33\2\3\1\34\12\3\1\35\5\3"+
    "\1\36\1\0\1\3\1\37\2\3\1\40\1\41\1\42"+
    "\11\3\1\43\1\44\3\3\1\45\4\3\1\46\2\3"+
    "\1\0\1\3\1\47\1\50\2\3\1\51\12\3\1\52"+
    "\3\3\1\53\1\3\1\0\2\3\1\54\1\55\1\56"+
    "\3\3\1\57\1\3\1\60\2\3\1\61\12\3\1\62"+
    "\2\3\1\63\1\64\7\3\1\65\1\3\1\66\1\67"+
    "\1\70\2\3\1\71\1\72\6\3\1\73\1\74\1\3"+
    "\1\75\1\3\1\76\1\77\1\3\1\100\1\101";

  private static int [] zzUnpackAction() {
    int [] result = new int[217];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\160\0\250\0\340\0\u0118\0\u0150"+
    "\0\u0188\0\160\0\160\0\160\0\160\0\160\0\160\0\u01c0"+
    "\0\u01f8\0\u0230\0\160\0\160\0\u0268\0\u02a0\0\u02d8\0\u0310"+
    "\0\u0348\0\u0380\0\u03b8\0\u03f0\0\u0428\0\u0460\0\u0498\0\u04d0"+
    "\0\u0508\0\u0540\0\u0578\0\u05b0\0\160\0\160\0\160\0\u05e8"+
    "\0\u0620\0\160\0\u0658\0\u0690\0\160\0\160\0\160\0\160"+
    "\0\160\0\u06c8\0\u0700\0\u0738\0\u0770\0\u07a8\0\u07e0\0\u0818"+
    "\0\u0850\0\u0888\0\u08c0\0\u08f8\0\250\0\u0930\0\u0968\0\u09a0"+
    "\0\u09d8\0\u0a10\0\u0a48\0\u0a80\0\u0ab8\0\u0af0\0\u0b28\0\u0b60"+
    "\0\u0b98\0\u0bd0\0\u0c08\0\u0c40\0\u0c78\0\u0cb0\0\u0ce8\0\u0d20"+
    "\0\u0d58\0\250\0\u0d90\0\u0dc8\0\250\0\u0e00\0\u0e38\0\u0e70"+
    "\0\u0ea8\0\u0ee0\0\u0f18\0\u0f50\0\u0f88\0\u0fc0\0\u0ff8\0\250"+
    "\0\u1030\0\u1068\0\u10a0\0\u10d8\0\u1110\0\160\0\u1148\0\u1180"+
    "\0\160\0\u11b8\0\u11f0\0\250\0\160\0\160\0\u1228\0\u1260"+
    "\0\u1298\0\u12d0\0\u1308\0\u1340\0\u1378\0\u13b0\0\u13e8\0\160"+
    "\0\250\0\u1420\0\u1458\0\u1490\0\160\0\u14c8\0\u1500\0\u1538"+
    "\0\u1570\0\250\0\u15a8\0\u15e0\0\u1618\0\u1650\0\250\0\160"+
    "\0\u1688\0\u16c0\0\u16f8\0\u1730\0\u1768\0\u17a0\0\u17d8\0\u1810"+
    "\0\u1848\0\u1880\0\u18b8\0\u18f0\0\u1928\0\160\0\u1960\0\u1998"+
    "\0\u19d0\0\250\0\u1a08\0\u1a40\0\u1a78\0\u1ab0\0\250\0\160"+
    "\0\160\0\u1ae8\0\u1b20\0\u1b58\0\160\0\u1b90\0\250\0\u1bc8"+
    "\0\u1c00\0\250\0\u1c38\0\u1c70\0\u1ca8\0\u1ce0\0\u1d18\0\u1d50"+
    "\0\u1d88\0\u1dc0\0\u1df8\0\u1e30\0\u1e68\0\u1ea0\0\u1ed8\0\160"+
    "\0\160\0\u1f10\0\u1f48\0\u1f80\0\u1fb8\0\u1ff0\0\u2028\0\u2060"+
    "\0\160\0\u2098\0\250\0\160\0\160\0\u20d0\0\u2108\0\160"+
    "\0\160\0\u2140\0\u2178\0\u21b0\0\u21e8\0\u2220\0\u2258\0\160"+
    "\0\160\0\u2290\0\160\0\u22c8\0\160\0\160\0\u2300\0\160"+
    "\0\160";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[217];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\3\1\4\1\10"+
    "\1\11\1\3\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\5\1\31\1\32\1\5\1\33\1\5\1\34"+
    "\1\5\1\35\1\36\1\37\1\40\3\5\1\41\1\42"+
    "\1\43\11\5\1\44\1\5\1\45\1\46\70\3\72\0"+
    "\2\5\23\0\23\5\1\0\13\5\5\0\1\6\64\0"+
    "\4\7\1\47\1\50\1\0\61\7\5\10\1\51\1\0"+
    "\1\52\60\10\10\0\1\53\1\54\76\0\1\55\70\0"+
    "\1\56\70\0\1\57\66\0\1\60\74\0\1\61\43\0"+
    "\2\5\23\0\1\5\1\62\6\5\1\63\1\5\1\64"+
    "\10\5\1\0\13\5\4\0\2\5\23\0\17\5\1\65"+
    "\3\5\1\0\13\5\4\0\2\5\23\0\7\5\1\66"+
    "\1\5\1\67\11\5\1\0\13\5\4\0\2\5\23\0"+
    "\1\70\22\5\1\0\13\5\4\0\2\5\23\0\1\71"+
    "\1\72\6\5\1\73\6\5\1\74\3\5\1\0\13\5"+
    "\4\0\2\5\23\0\6\5\1\75\2\5\1\76\2\5"+
    "\1\77\6\5\1\0\13\5\4\0\2\5\23\0\1\100"+
    "\22\5\1\0\13\5\4\0\2\5\23\0\12\5\1\101"+
    "\10\5\1\0\13\5\4\0\2\5\23\0\7\5\1\102"+
    "\2\5\1\103\10\5\1\0\13\5\4\0\2\5\23\0"+
    "\3\5\1\104\4\5\1\105\12\5\1\0\13\5\4\0"+
    "\2\5\23\0\22\5\1\106\1\0\13\5\4\0\2\5"+
    "\23\0\3\5\1\107\17\5\1\0\13\5\55\0\1\110"+
    "\1\0\1\111\14\0\2\5\23\0\12\5\1\112\10\5"+
    "\1\0\13\5\2\0\70\7\70\10\6\53\1\0\61\53"+
    "\11\54\1\113\56\54\2\0\2\5\23\0\2\5\1\114"+
    "\1\115\17\5\1\0\13\5\4\0\2\5\23\0\14\5"+
    "\1\116\6\5\1\0\13\5\4\0\2\5\23\0\11\5"+
    "\1\117\11\5\1\0\13\5\4\0\2\5\23\0\7\5"+
    "\1\120\13\5\1\0\13\5\4\0\2\5\23\0\7\5"+
    "\1\121\13\5\1\0\13\5\4\0\2\5\23\0\16\5"+
    "\1\122\4\5\1\0\13\5\4\0\2\5\23\0\1\5"+
    "\1\123\21\5\1\0\13\5\4\0\2\5\23\0\1\5"+
    "\1\124\21\5\1\0\13\5\4\0\2\5\23\0\13\5"+
    "\1\125\7\5\1\0\13\5\4\0\2\5\23\0\13\5"+
    "\1\126\7\5\1\0\13\5\4\0\2\5\23\0\11\5"+
    "\1\127\11\5\1\0\13\5\4\0\2\5\23\0\7\5"+
    "\1\130\13\5\1\0\13\5\4\0\2\5\23\0\23\5"+
    "\1\0\10\5\1\131\2\5\4\0\2\5\23\0\7\5"+
    "\1\132\4\5\1\133\6\5\1\0\13\5\4\0\2\5"+
    "\23\0\7\5\1\134\13\5\1\0\6\5\1\135\4\5"+
    "\4\0\2\5\23\0\3\5\1\136\7\5\1\137\7\5"+
    "\1\0\13\5\4\0\2\5\23\0\20\5\1\140\2\5"+
    "\1\0\13\5\4\0\2\5\23\0\7\5\1\141\6\5"+
    "\1\142\4\5\1\0\13\5\4\0\2\5\23\0\2\5"+
    "\1\143\20\5\1\0\13\5\4\0\2\5\23\0\10\5"+
    "\1\144\12\5\1\0\13\5\4\0\2\5\23\0\14\5"+
    "\1\145\6\5\1\0\13\5\56\0\1\146\71\0\1\147"+
    "\13\0\2\5\23\0\13\5\1\150\7\5\1\0\13\5"+
    "\2\0\10\54\1\151\1\113\56\54\2\0\2\5\23\0"+
    "\3\5\1\152\17\5\1\0\13\5\4\0\2\5\23\0"+
    "\15\5\1\153\5\5\1\0\13\5\4\0\2\5\23\0"+
    "\7\5\1\154\13\5\1\0\13\5\4\0\2\5\6\0"+
    "\1\155\14\0\23\5\1\0\13\5\4\0\2\5\6\0"+
    "\1\156\14\0\23\5\1\0\13\5\4\0\2\5\23\0"+
    "\13\5\1\157\7\5\1\0\13\5\4\0\2\5\23\0"+
    "\5\5\1\160\15\5\1\0\13\5\4\0\2\5\23\0"+
    "\3\5\1\161\17\5\1\0\13\5\4\0\2\5\23\0"+
    "\14\5\1\162\6\5\1\0\13\5\4\0\2\5\23\0"+
    "\2\5\1\163\20\5\1\0\13\5\4\0\2\5\23\0"+
    "\12\5\1\164\10\5\1\0\13\5\4\0\2\5\23\0"+
    "\1\165\10\5\1\166\2\5\1\167\6\5\1\0\13\5"+
    "\4\0\2\5\6\0\1\170\14\0\23\5\1\0\13\5"+
    "\4\0\2\5\23\0\12\5\1\171\10\5\1\0\13\5"+
    "\4\0\2\5\23\0\17\5\1\172\3\5\1\0\13\5"+
    "\4\0\2\5\23\0\1\5\1\173\21\5\1\0\13\5"+
    "\4\0\2\5\23\0\7\5\1\174\13\5\1\0\13\5"+
    "\4\0\2\5\6\0\1\175\14\0\10\5\1\176\12\5"+
    "\1\0\13\5\4\0\2\5\23\0\12\5\1\177\10\5"+
    "\1\0\13\5\4\0\2\5\23\0\15\5\1\200\5\5"+
    "\1\0\7\5\1\201\3\5\4\0\2\5\23\0\7\5"+
    "\1\202\13\5\1\0\13\5\4\0\2\5\23\0\1\203"+
    "\22\5\1\0\13\5\4\0\2\5\23\0\22\5\1\204"+
    "\1\0\13\5\61\0\1\205\12\0\2\5\23\0\11\5"+
    "\1\206\11\5\1\0\13\5\4\0\2\5\23\0\1\207"+
    "\22\5\1\0\13\5\4\0\2\5\6\0\1\210\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\23\0\10\5\1\211"+
    "\12\5\1\0\13\5\4\0\2\5\23\0\3\5\1\212"+
    "\17\5\1\0\13\5\4\0\2\5\23\0\7\5\1\213"+
    "\13\5\1\0\13\5\4\0\2\5\23\0\7\5\1\214"+
    "\13\5\1\0\13\5\4\0\2\5\23\0\7\5\1\215"+
    "\13\5\1\0\13\5\4\0\2\5\23\0\4\5\1\216"+
    "\16\5\1\0\13\5\4\0\2\5\23\0\10\5\1\217"+
    "\12\5\1\0\13\5\4\0\2\5\23\0\3\5\1\220"+
    "\17\5\1\0\13\5\4\0\2\5\23\0\7\5\1\221"+
    "\13\5\1\0\13\5\4\0\2\5\23\0\13\5\1\222"+
    "\7\5\1\0\13\5\4\0\2\5\23\0\23\5\1\0"+
    "\12\5\1\223\4\0\2\5\23\0\17\5\1\224\3\5"+
    "\1\0\13\5\4\0\2\5\23\0\11\5\1\225\11\5"+
    "\1\0\13\5\4\0\2\5\6\0\1\226\14\0\7\5"+
    "\1\227\13\5\1\0\13\5\4\0\2\5\23\0\10\5"+
    "\1\230\12\5\1\0\13\5\4\0\2\5\23\0\1\231"+
    "\22\5\1\0\13\5\4\0\2\5\23\0\12\5\1\232"+
    "\10\5\1\0\13\5\4\0\2\5\23\0\23\5\1\0"+
    "\10\5\1\233\2\5\56\0\1\234\15\0\2\5\23\0"+
    "\12\5\1\235\10\5\1\0\13\5\4\0\2\5\23\0"+
    "\5\5\1\236\15\5\1\0\13\5\4\0\2\5\23\0"+
    "\1\237\22\5\1\0\13\5\4\0\2\5\6\0\1\240"+
    "\14\0\23\5\1\0\13\5\4\0\2\5\6\0\1\241"+
    "\14\0\23\5\1\0\13\5\4\0\2\5\23\0\10\5"+
    "\1\242\12\5\1\0\13\5\4\0\2\5\23\0\12\5"+
    "\1\243\10\5\1\0\13\5\4\0\2\5\23\0\14\5"+
    "\1\244\6\5\1\0\13\5\4\0\2\5\6\0\1\245"+
    "\14\0\23\5\1\0\13\5\4\0\2\5\23\0\13\5"+
    "\1\246\7\5\1\0\13\5\4\0\2\5\23\0\11\5"+
    "\1\247\11\5\1\0\13\5\4\0\2\5\23\0\12\5"+
    "\1\250\10\5\1\0\13\5\4\0\2\5\23\0\14\5"+
    "\1\251\6\5\1\0\13\5\4\0\2\5\23\0\4\5"+
    "\1\252\16\5\1\0\13\5\4\0\2\5\23\0\10\5"+
    "\1\253\12\5\1\0\13\5\4\0\2\5\23\0\6\5"+
    "\1\254\14\5\1\0\13\5\4\0\2\5\23\0\17\5"+
    "\1\255\3\5\1\0\13\5\4\0\2\5\23\0\4\5"+
    "\1\256\3\5\1\257\12\5\1\0\7\5\1\260\1\5"+
    "\1\261\1\5\62\0\1\146\11\0\2\5\23\0\1\262"+
    "\22\5\1\0\13\5\4\0\2\5\23\0\17\5\1\263"+
    "\3\5\1\0\13\5\4\0\2\5\23\0\1\5\1\264"+
    "\21\5\1\0\13\5\4\0\2\5\23\0\13\5\1\265"+
    "\7\5\1\0\13\5\4\0\2\5\23\0\7\5\1\266"+
    "\13\5\1\0\13\5\4\0\2\5\23\0\10\5\1\267"+
    "\12\5\1\0\13\5\4\0\2\5\6\0\1\270\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\6\0\1\271\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\23\0\23\5\1\0"+
    "\6\5\1\272\4\5\4\0\2\5\23\0\6\5\1\273"+
    "\14\5\1\0\13\5\4\0\2\5\23\0\14\5\1\274"+
    "\6\5\1\0\13\5\4\0\2\5\23\0\12\5\1\275"+
    "\10\5\1\0\13\5\4\0\2\5\23\0\14\5\1\276"+
    "\6\5\1\0\13\5\4\0\2\5\23\0\17\5\1\277"+
    "\3\5\1\0\13\5\4\0\2\5\23\0\12\5\1\300"+
    "\10\5\1\0\13\5\4\0\2\5\6\0\1\301\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\23\0\7\5\1\302"+
    "\13\5\1\0\13\5\4\0\2\5\23\0\11\5\1\303"+
    "\11\5\1\0\13\5\4\0\2\5\6\0\1\304\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\6\0\1\305\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\23\0\11\5\1\306"+
    "\11\5\1\0\13\5\4\0\2\5\23\0\12\5\1\307"+
    "\10\5\1\0\13\5\4\0\2\5\6\0\1\310\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\6\0\1\311\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\23\0\7\5\1\312"+
    "\13\5\1\0\13\5\4\0\2\5\23\0\23\5\1\0"+
    "\11\5\1\313\1\5\4\0\2\5\23\0\7\5\1\314"+
    "\13\5\1\0\13\5\4\0\2\5\23\0\16\5\1\315"+
    "\4\5\1\0\13\5\4\0\2\5\23\0\12\5\1\316"+
    "\10\5\1\0\13\5\4\0\2\5\23\0\4\5\1\317"+
    "\16\5\1\0\13\5\4\0\2\5\6\0\1\320\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\6\0\1\321\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\23\0\12\5\1\322"+
    "\10\5\1\0\13\5\4\0\2\5\6\0\1\323\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\23\0\14\5\1\324"+
    "\6\5\1\0\13\5\4\0\2\5\6\0\1\325\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\6\0\1\326\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\23\0\16\5\1\327"+
    "\4\5\1\0\13\5\4\0\2\5\6\0\1\330\14\0"+
    "\23\5\1\0\13\5\4\0\2\5\6\0\1\331\14\0"+
    "\23\5\1\0\13\5\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9016];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\5\1\6\11\3\1\2\11\20\1\3\11"+
    "\2\1\1\11\1\1\1\0\5\11\26\1\2\0\1\1"+
    "\1\0\32\1\1\11\1\0\1\1\1\11\3\1\2\11"+
    "\11\1\1\11\4\1\1\11\7\1\1\0\2\1\1\11"+
    "\15\1\1\11\5\1\1\0\3\1\2\11\3\1\1\11"+
    "\22\1\2\11\7\1\1\11\2\1\2\11\2\1\2\11"+
    "\6\1\2\11\1\1\1\11\1\1\2\11\1\1\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[217];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public FormulaEngineLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 66: break;
          case 2: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 67: break;
          case 3: 
            { return FormulaEngineElementTypes.IDENTIFIER;
            } 
            // fall through
          case 68: break;
          case 4: 
            { return FormulaEngineElementTypes.NUMBER_INTEGER;
            } 
            // fall through
          case 69: break;
          case 5: 
            { return FormulaEngineElementTypes.SINGLE_QUOTED_STRING;
            } 
            // fall through
          case 70: break;
          case 6: 
            { return FormulaEngineElementTypes.DOUBLE_QUOTED_STRING;
            } 
            // fall through
          case 71: break;
          case 7: 
            { return FormulaEngineElementTypes.LEFT_PARENTHESIS;
            } 
            // fall through
          case 72: break;
          case 8: 
            { return FormulaEngineElementTypes.RIGHT_PARENTHESIS;
            } 
            // fall through
          case 73: break;
          case 9: 
            { return FormulaEngineElementTypes.LEFT_CURLY_BRACE;
            } 
            // fall through
          case 74: break;
          case 10: 
            { return FormulaEngineElementTypes.RIGHT_CURLY_BRACE;
            } 
            // fall through
          case 75: break;
          case 11: 
            { return FormulaEngineElementTypes.LEFT_BRACKET;
            } 
            // fall through
          case 76: break;
          case 12: 
            { return FormulaEngineElementTypes.RIGHT_BRACKET;
            } 
            // fall through
          case 77: break;
          case 13: 
            { return FormulaEngineElementTypes.OPERATOR_ASSIGNMENT;
            } 
            // fall through
          case 78: break;
          case 14: 
            { return FormulaEngineElementTypes.OPERATOR_PLUS;
            } 
            // fall through
          case 79: break;
          case 15: 
            { return FormulaEngineElementTypes.OPERATOR_LESSTHAN;
            } 
            // fall through
          case 80: break;
          case 16: 
            { return FormulaEngineElementTypes.OPERATOR_MODULO;
            } 
            // fall through
          case 81: break;
          case 17: 
            { return FormulaEngineElementTypes.OPERATOR_NEGATION;
            } 
            // fall through
          case 82: break;
          case 18: 
            { return FormulaEngineElementTypes.COMMA;
            } 
            // fall through
          case 83: break;
          case 19: 
            { return FormulaEngineElementTypes.SEMICOLON;
            } 
            // fall through
          case 84: break;
          case 20: 
            { return FormulaEngineElementTypes.LINE_COMMENT;
            } 
            // fall through
          case 85: break;
          case 21: 
            { return FormulaEngineElementTypes.OPERATOR_AND;
            } 
            // fall through
          case 86: break;
          case 22: 
            { return FormulaEngineElementTypes.OPERATOR_EQUAL;
            } 
            // fall through
          case 87: break;
          case 23: 
            { return FormulaEngineElementTypes.OPERATOR_INCREMENT;
            } 
            // fall through
          case 88: break;
          case 24: 
            { return FormulaEngineElementTypes.OPERATOR_NOTEQUAL;
            } 
            // fall through
          case 89: break;
          case 25: 
            { return FormulaEngineElementTypes.OPERATOR_OR;
            } 
            // fall through
          case 90: break;
          case 26: 
            { return FormulaEngineElementTypes.KEYWORD_IF;
            } 
            // fall through
          case 91: break;
          case 27: 
            { return FormulaEngineElementTypes.TYPE_ANY;
            } 
            // fall through
          case 92: break;
          case 28: 
            { return FormulaEngineElementTypes.KEYWORD_FOR;
            } 
            // fall through
          case 93: break;
          case 29: 
            { return FormulaEngineElementTypes.KEYWORD_SEQ;
            } 
            // fall through
          case 94: break;
          case 30: 
            { return FormulaEngineElementTypes.BUILT_IN_VAR_NA;
            } 
            // fall through
          case 95: break;
          case 31: 
            { return FormulaEngineElementTypes.BLOCK_COMMENT;
            } 
            // fall through
          case 96: break;
          case 32: 
            { return FormulaEngineElementTypes.TYPE_LIST;
            } 
            // fall through
          case 97: break;
          case 33: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_LEN;
            } 
            // fall through
          case 98: break;
          case 34: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_OUT;
            } 
            // fall through
          case 99: break;
          case 35: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_ELT;
            } 
            // fall through
          case 100: break;
          case 36: 
            { return FormulaEngineElementTypes.KEYWORD_ELSE;
            } 
            // fall through
          case 101: break;
          case 37: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_STR;
            } 
            // fall through
          case 102: break;
          case 38: 
            { return FormulaEngineElementTypes.TYPE_DICT;
            } 
            // fall through
          case 103: break;
          case 39: 
            { return FormulaEngineElementTypes.VISIBILITY_LOCAL;
            } 
            // fall through
          case 104: break;
          case 40: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_LOAD;
            } 
            // fall through
          case 105: break;
          case 41: 
            { return FormulaEngineElementTypes.TYPE_FLOAT;
            } 
            // fall through
          case 106: break;
          case 42: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DATE;
            } 
            // fall through
          case 107: break;
          case 43: 
            { return FormulaEngineElementTypes.KEYWORD_WHILE;
            } 
            // fall through
          case 108: break;
          case 44: 
            { return FormulaEngineElementTypes.VISIBILITY_GLOBAL;
            } 
            // fall through
          case 109: break;
          case 45: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_FLOAT;
            } 
            // fall through
          case 110: break;
          case 46: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_FIRST;
            } 
            // fall through
          case 111: break;
          case 47: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_NA;
            } 
            // fall through
          case 112: break;
          case 48: 
            { return FormulaEngineElementTypes.KEYWORD_RETURN;
            } 
            // fall through
          case 113: break;
          case 49: 
            { return FormulaEngineElementTypes.TYPE_STRING;
            } 
            // fall through
          case 114: break;
          case 50: 
            { return FormulaEngineElementTypes.TYPE_INTEGER;
            } 
            // fall through
          case 115: break;
          case 51: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_REMOVE;
            } 
            // fall through
          case 116: break;
          case 52: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_STATUS;
            } 
            // fall through
          case 117: break;
          case 53: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_KERNEL;
            } 
            // fall through
          case 118: break;
          case 54: 
            { return FormulaEngineElementTypes.KEYWORD_FUNCTION;
            } 
            // fall through
          case 119: break;
          case 55: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_INTEGER;
            } 
            // fall through
          case 120: break;
          case 56: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_LIST;
            } 
            // fall through
          case 121: break;
          case 57: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DAYDIFF;
            } 
            // fall through
          case 122: break;
          case 58: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DAYPLUS;
            } 
            // fall through
          case 123: break;
          case 59: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_DATETIME;
            } 
            // fall through
          case 124: break;
          case 60: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_GET;
            } 
            // fall through
          case 125: break;
          case 61: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_PUT;
            } 
            // fall through
          case 126: break;
          case 62: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_ATTRIBUTE;
            } 
            // fall through
          case 127: break;
          case 63: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_IS_STRING;
            } 
            // fall through
          case 128: break;
          case 64: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_KEYS;
            } 
            // fall through
          case 129: break;
          case 65: 
            { yypushback(1); return FormulaEngineElementTypes.BUILT_IN_FUNC_HASH_ISKEY;
            } 
            // fall through
          case 130: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
