// This is a generated file. Not intended for manual editing.
package top.xystudio.plugin.idea.liteflowx.system.language.parse;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import static top.xystudio.plugin.idea.liteflowx.system.language.psi.LiteFlowTypes.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class LiteFlowParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return liteFlowFile(b, l + 1);
  }

  /* ********************************************************** */
  // (subAllExpress | PAREN_LEFT subAllExpress PAREN_RIGHT) {op (subAllExpress|PAREN_LEFT subAllExpress PAREN_RIGHT)}*
  //                | {(subAllExpress | PAREN_LEFT subAllExpress PAREN_RIGHT) op}* (subAllExpress|PAREN_LEFT subAllExpress PAREN_RIGHT)
  public static boolean allExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_ALL_EXPRESS, "<all express>");
    r = allExpress_0(b, l + 1);
    if (!r) r = allExpress_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (subAllExpress | PAREN_LEFT subAllExpress PAREN_RIGHT) {op (subAllExpress|PAREN_LEFT subAllExpress PAREN_RIGHT)}*
  private static boolean allExpress_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = allExpress_0_0(b, l + 1);
    r = r && allExpress_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // subAllExpress | PAREN_LEFT subAllExpress PAREN_RIGHT
  private static boolean allExpress_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = subAllExpress(b, l + 1);
    if (!r) r = allExpress_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PAREN_LEFT subAllExpress PAREN_RIGHT
  private static boolean allExpress_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_PAREN_LEFT);
    r = r && subAllExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_PAREN_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // {op (subAllExpress|PAREN_LEFT subAllExpress PAREN_RIGHT)}*
  private static boolean allExpress_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!allExpress_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "allExpress_0_1", c)) break;
    }
    return true;
  }

  // op (subAllExpress|PAREN_LEFT subAllExpress PAREN_RIGHT)
  private static boolean allExpress_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op(b, l + 1);
    r = r && allExpress_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // subAllExpress|PAREN_LEFT subAllExpress PAREN_RIGHT
  private static boolean allExpress_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = subAllExpress(b, l + 1);
    if (!r) r = allExpress_0_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PAREN_LEFT subAllExpress PAREN_RIGHT
  private static boolean allExpress_0_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_0_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_PAREN_LEFT);
    r = r && subAllExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_PAREN_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // {(subAllExpress | PAREN_LEFT subAllExpress PAREN_RIGHT) op}* (subAllExpress|PAREN_LEFT subAllExpress PAREN_RIGHT)
  private static boolean allExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = allExpress_1_0(b, l + 1);
    r = r && allExpress_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {(subAllExpress | PAREN_LEFT subAllExpress PAREN_RIGHT) op}*
  private static boolean allExpress_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!allExpress_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "allExpress_1_0", c)) break;
    }
    return true;
  }

  // (subAllExpress | PAREN_LEFT subAllExpress PAREN_RIGHT) op
  private static boolean allExpress_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = allExpress_1_0_0_0(b, l + 1);
    r = r && op(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // subAllExpress | PAREN_LEFT subAllExpress PAREN_RIGHT
  private static boolean allExpress_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = subAllExpress(b, l + 1);
    if (!r) r = allExpress_1_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PAREN_LEFT subAllExpress PAREN_RIGHT
  private static boolean allExpress_1_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_1_0_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_PAREN_LEFT);
    r = r && subAllExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_PAREN_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // subAllExpress|PAREN_LEFT subAllExpress PAREN_RIGHT
  private static boolean allExpress_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = subAllExpress(b, l + 1);
    if (!r) r = allExpress_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PAREN_LEFT subAllExpress PAREN_RIGHT
  private static boolean allExpress_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allExpress_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_PAREN_LEFT);
    r = r && subAllExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_PAREN_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BRACK_LEFT [allExpress {COMMA (allExpress|op)}*] BRACK_RIGHT
  public static boolean arrayExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_BRACK_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_BRACK_LEFT);
    r = r && arrayExpress_1(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_BRACK_RIGHT);
    exit_section_(b, m, LITEFLOW_ARRAY_EXPRESS, r);
    return r;
  }

  // [allExpress {COMMA (allExpress|op)}*]
  private static boolean arrayExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayExpress_1")) return false;
    arrayExpress_1_0(b, l + 1);
    return true;
  }

  // allExpress {COMMA (allExpress|op)}*
  private static boolean arrayExpress_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayExpress_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = allExpress(b, l + 1);
    r = r && arrayExpress_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {COMMA (allExpress|op)}*
  private static boolean arrayExpress_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayExpress_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayExpress_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayExpress_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA (allExpress|op)
  private static boolean arrayExpress_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayExpress_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_COMMA);
    r = r && arrayExpress_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // allExpress|op
  private static boolean arrayExpress_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayExpress_1_0_1_0_1")) return false;
    boolean r;
    r = allExpress(b, l + 1);
    if (!r) r = op(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // refExpress ASSIGN [PLUS|MINUS] allExpress
  public static boolean assignExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = refExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_ASSIGN);
    r = r && assignExpress_2(b, l + 1);
    r = r && allExpress(b, l + 1);
    exit_section_(b, m, LITEFLOW_ASSIGN_EXPRESS, r);
    return r;
  }

  // [PLUS|MINUS]
  private static boolean assignExpress_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpress_2")) return false;
    assignExpress_2_0(b, l + 1);
    return true;
  }

  // PLUS|MINUS
  private static boolean assignExpress_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpress_2_0")) return false;
    boolean r;
    r = consumeToken(b, LITEFLOW_PLUS);
    if (!r) r = consumeToken(b, LITEFLOW_MINUS);
    return r;
  }

  /* ********************************************************** */
  // assignExpress SEMICOLON
  public static boolean assignStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignStatement")) return false;
    if (!nextTokenIs(b, LITEFLOW_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_SEMICOLON);
    exit_section_(b, m, LITEFLOW_ASSIGN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // true|false
  public static boolean boolean_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_$")) return false;
    if (!nextTokenIs(b, "<boolean $>", LITEFLOW_FALSE, LITEFLOW_TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_BOOLEAN, "<boolean $>");
    r = consumeToken(b, LITEFLOW_TRUE);
    if (!r) r = consumeToken(b, LITEFLOW_FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // break SEMICOLON
  public static boolean breakStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStatement")) return false;
    if (!nextTokenIs(b, LITEFLOW_BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LITEFLOW_BREAK, LITEFLOW_SEMICOLON);
    exit_section_(b, m, LITEFLOW_BREAK_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // statement*
  public static boolean codes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "codes")) return false;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_CODES, "<codes>");
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "codes", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // continue SEMICOLON
  public static boolean continueStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStatement")) return false;
    if (!nextTokenIs(b, LITEFLOW_CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LITEFLOW_CONTINUE, LITEFLOW_SEMICOLON);
    exit_section_(b, m, LITEFLOW_CONTINUE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean elVariableRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elVariableRef")) return false;
    if (!nextTokenIs(b, LITEFLOW_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_IDENTIFIER);
    exit_section_(b, m, LITEFLOW_EL_VARIABLE_REF, r);
    return r;
  }

  /* ********************************************************** */
  // opExpress | PAREN_LEFT opExpress PAREN_RIGHT  |  opExpress  {op (allExpress|PAREN_LEFT allExpress PAREN_RIGHT)}*
  public static boolean express(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "express")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_EXPRESS, "<express>");
    r = opExpress(b, l + 1);
    if (!r) r = express_1(b, l + 1);
    if (!r) r = express_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PAREN_LEFT opExpress PAREN_RIGHT
  private static boolean express_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "express_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_PAREN_LEFT);
    r = r && opExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_PAREN_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // opExpress  {op (allExpress|PAREN_LEFT allExpress PAREN_RIGHT)}*
  private static boolean express_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "express_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opExpress(b, l + 1);
    r = r && express_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {op (allExpress|PAREN_LEFT allExpress PAREN_RIGHT)}*
  private static boolean express_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "express_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!express_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "express_2_1", c)) break;
    }
    return true;
  }

  // op (allExpress|PAREN_LEFT allExpress PAREN_RIGHT)
  private static boolean express_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "express_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op(b, l + 1);
    r = r && express_2_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // allExpress|PAREN_LEFT allExpress PAREN_RIGHT
  private static boolean express_2_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "express_2_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = allExpress(b, l + 1);
    if (!r) r = express_2_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PAREN_LEFT allExpress PAREN_RIGHT
  private static boolean express_2_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "express_2_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_PAREN_LEFT);
    r = r && allExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_PAREN_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // refExpress fnParamExpress
  public static boolean fnInvokeExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnInvokeExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = refExpress(b, l + 1);
    r = r && fnParamExpress(b, l + 1);
    exit_section_(b, m, LITEFLOW_FN_INVOKE_EXPRESS, r);
    return r;
  }

  /* ********************************************************** */
  // fnInvokeExpress SEMICOLON
  public static boolean fnInvokeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnInvokeStatement")) return false;
    if (!nextTokenIs(b, LITEFLOW_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fnInvokeExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_SEMICOLON);
    exit_section_(b, m, LITEFLOW_FN_INVOKE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // {PAREN_LEFT [allExpress {COMMA (allExpress|op)}*] PAREN_RIGHT}+
  public static boolean fnParamExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnParamExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_PAREN_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fnParamExpress_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!fnParamExpress_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fnParamExpress", c)) break;
    }
    exit_section_(b, m, LITEFLOW_FN_PARAM_EXPRESS, r);
    return r;
  }

  // PAREN_LEFT [allExpress {COMMA (allExpress|op)}*] PAREN_RIGHT
  private static boolean fnParamExpress_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnParamExpress_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_PAREN_LEFT);
    r = r && fnParamExpress_0_1(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_PAREN_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [allExpress {COMMA (allExpress|op)}*]
  private static boolean fnParamExpress_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnParamExpress_0_1")) return false;
    fnParamExpress_0_1_0(b, l + 1);
    return true;
  }

  // allExpress {COMMA (allExpress|op)}*
  private static boolean fnParamExpress_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnParamExpress_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = allExpress(b, l + 1);
    r = r && fnParamExpress_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {COMMA (allExpress|op)}*
  private static boolean fnParamExpress_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnParamExpress_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!fnParamExpress_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fnParamExpress_0_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA (allExpress|op)
  private static boolean fnParamExpress_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnParamExpress_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_COMMA);
    r = r && fnParamExpress_0_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // allExpress|op
  private static boolean fnParamExpress_0_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnParamExpress_0_1_0_1_0_1")) return false;
    boolean r;
    r = allExpress(b, l + 1);
    if (!r) r = op(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // for PAREN_LEFT [assignExpress] SEMICOLON [allExpress] SEMICOLON [(opSelfExpress | assignExpress)]  PAREN_RIGHT BRACE_LEFT codes BRACE_RIGHT
  public static boolean forStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement")) return false;
    if (!nextTokenIs(b, LITEFLOW_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LITEFLOW_FOR, LITEFLOW_PAREN_LEFT);
    r = r && forStatement_2(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_SEMICOLON);
    r = r && forStatement_4(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_SEMICOLON);
    r = r && forStatement_6(b, l + 1);
    r = r && consumeTokens(b, 0, LITEFLOW_PAREN_RIGHT, LITEFLOW_BRACE_LEFT);
    r = r && codes(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_BRACE_RIGHT);
    exit_section_(b, m, LITEFLOW_FOR_STATEMENT, r);
    return r;
  }

  // [assignExpress]
  private static boolean forStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_2")) return false;
    assignExpress(b, l + 1);
    return true;
  }

  // [allExpress]
  private static boolean forStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_4")) return false;
    allExpress(b, l + 1);
    return true;
  }

  // [(opSelfExpress | assignExpress)]
  private static boolean forStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_6")) return false;
    forStatement_6_0(b, l + 1);
    return true;
  }

  // opSelfExpress | assignExpress
  private static boolean forStatement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_6_0")) return false;
    boolean r;
    r = opSelfExpress(b, l + 1);
    if (!r) r = assignExpress(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // if PAREN_LEFT allExpress PAREN_RIGHT BRACE_LEFT codes BRACE_RIGHT {else ifStatement }* {else BRACE_LEFT codes BRACE_RIGHT}?
  public static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    if (!nextTokenIs(b, LITEFLOW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LITEFLOW_IF, LITEFLOW_PAREN_LEFT);
    r = r && allExpress(b, l + 1);
    r = r && consumeTokens(b, 0, LITEFLOW_PAREN_RIGHT, LITEFLOW_BRACE_LEFT);
    r = r && codes(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_BRACE_RIGHT);
    r = r && ifStatement_7(b, l + 1);
    r = r && ifStatement_8(b, l + 1);
    exit_section_(b, m, LITEFLOW_IF_STATEMENT, r);
    return r;
  }

  // {else ifStatement }*
  private static boolean ifStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ifStatement_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifStatement_7", c)) break;
    }
    return true;
  }

  // else ifStatement
  private static boolean ifStatement_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_ELSE);
    r = r && ifStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {else BRACE_LEFT codes BRACE_RIGHT}?
  private static boolean ifStatement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_8")) return false;
    ifStatement_8_0(b, l + 1);
    return true;
  }

  // else BRACE_LEFT codes BRACE_RIGHT
  private static boolean ifStatement_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LITEFLOW_ELSE, LITEFLOW_BRACE_LEFT);
    r = r && codes(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_BRACE_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // liteFlowConditionExpress | liteFlowNodeRefExpress
  public static boolean liteFlowAllExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowAllExpress")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_ALL_EXPRESS, "<lite flow all express>");
    r = liteFlowConditionExpress(b, l + 1);
    if (!r) r = liteFlowNodeRefExpress(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // any PAREN_LEFT boolean PAREN_RIGHT
  public static boolean liteFlowAnyExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowAnyExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_ANY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_ANY_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_ANY, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, boolean_$(b, l + 1));
    r = p && consumeToken(b, LITEFLOW_PAREN_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LBREAK PAREN_LEFT liteFlowNodeRefExpress PAREN_RIGHT
  public static boolean liteFlowBreakExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowBreakExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_LBREAK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_BREAK_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_LBREAK, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowNodeRefExpress(b, l + 1));
    r = p && consumeToken(b, LITEFLOW_PAREN_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // {block_comment | line_comment}* (liteFlowThenExpress | liteFlowWhenExpress | liteFlowSwitchExpress | liteFlowPreExpress | liteFlowFinallyExpress | liteFlowIf2Express | liteFlowIf3Express | liteFlowForExpress | liteFlowIteratorExpress | liteFlowWhileExpress) {block_comment | line_comment}*
  public static boolean liteFlowConditionExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowConditionExpress")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_CONDITION_EXPRESS, "<lite flow condition express>");
    r = liteFlowConditionExpress_0(b, l + 1);
    r = r && liteFlowConditionExpress_1(b, l + 1);
    r = r && liteFlowConditionExpress_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {block_comment | line_comment}*
  private static boolean liteFlowConditionExpress_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowConditionExpress_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!liteFlowConditionExpress_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "liteFlowConditionExpress_0", c)) break;
    }
    return true;
  }

  // block_comment | line_comment
  private static boolean liteFlowConditionExpress_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowConditionExpress_0_0")) return false;
    boolean r;
    r = consumeToken(b, LITEFLOW_BLOCK_COMMENT);
    if (!r) r = consumeToken(b, LITEFLOW_LINE_COMMENT);
    return r;
  }

  // liteFlowThenExpress | liteFlowWhenExpress | liteFlowSwitchExpress | liteFlowPreExpress | liteFlowFinallyExpress | liteFlowIf2Express | liteFlowIf3Express | liteFlowForExpress | liteFlowIteratorExpress | liteFlowWhileExpress
  private static boolean liteFlowConditionExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowConditionExpress_1")) return false;
    boolean r;
    r = liteFlowThenExpress(b, l + 1);
    if (!r) r = liteFlowWhenExpress(b, l + 1);
    if (!r) r = liteFlowSwitchExpress(b, l + 1);
    if (!r) r = liteFlowPreExpress(b, l + 1);
    if (!r) r = liteFlowFinallyExpress(b, l + 1);
    if (!r) r = liteFlowIf2Express(b, l + 1);
    if (!r) r = liteFlowIf3Express(b, l + 1);
    if (!r) r = liteFlowForExpress(b, l + 1);
    if (!r) r = liteFlowIteratorExpress(b, l + 1);
    if (!r) r = liteFlowWhileExpress(b, l + 1);
    return r;
  }

  // {block_comment | line_comment}*
  private static boolean liteFlowConditionExpress_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowConditionExpress_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!liteFlowConditionExpress_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "liteFlowConditionExpress_2", c)) break;
    }
    return true;
  }

  // block_comment | line_comment
  private static boolean liteFlowConditionExpress_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowConditionExpress_2_0")) return false;
    boolean r;
    r = consumeToken(b, LITEFLOW_BLOCK_COMMENT);
    if (!r) r = consumeToken(b, LITEFLOW_LINE_COMMENT);
    return r;
  }

  /* ********************************************************** */
  // data PAREN_LEFT (string | elVariableRef) PAREN_RIGHT
  public static boolean liteFlowDataExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowDataExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_DATA)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_DATA_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_DATA, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowDataExpress_2(b, l + 1));
    r = p && consumeToken(b, LITEFLOW_PAREN_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // string | elVariableRef
  private static boolean liteFlowDataExpress_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowDataExpress_2")) return false;
    boolean r;
    r = consumeToken(b, LITEFLOW_STRING);
    if (!r) r = elVariableRef(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // DEFAULT PAREN_LEFT liteFlowAllExpress PAREN_RIGHT
  public static boolean liteFlowDefaultExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowDefaultExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_DEFAULT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_DEFAULT_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_DEFAULT, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowAllExpress(b, l + 1));
    r = p && consumeToken(b, LITEFLOW_PAREN_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // DO PAREN_LEFT liteFlowAllExpress PAREN_RIGHT
  public static boolean liteFlowDoExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowDoExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_DO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_DO_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_DO, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowAllExpress(b, l + 1));
    r = p && consumeToken(b, LITEFLOW_PAREN_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // codes
  static boolean liteFlowFile(PsiBuilder b, int l) {
    return codes(b, l + 1);
  }

  /* ********************************************************** */
  // FINALLY PAREN_LEFT liteFlowAllExpress {COMMA liteFlowAllExpress}* PAREN_RIGHT
  public static boolean liteFlowFinallyExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowFinallyExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_FINALLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_FINALLY_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_FINALLY, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowAllExpress(b, l + 1));
    r = p && report_error_(b, liteFlowFinallyExpress_3(b, l + 1)) && r;
    r = p && consumeToken(b, LITEFLOW_PAREN_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // {COMMA liteFlowAllExpress}*
  private static boolean liteFlowFinallyExpress_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowFinallyExpress_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!liteFlowFinallyExpress_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "liteFlowFinallyExpress_3", c)) break;
    }
    return true;
  }

  // COMMA liteFlowAllExpress
  private static boolean liteFlowFinallyExpress_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowFinallyExpress_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_COMMA);
    r = r && liteFlowAllExpress(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LFOR PAREN_LEFT (number | liteFlowNodeRefExpress) PAREN_RIGHT DOT liteFlowDoExpress [liteFlowForSubExpress]
  public static boolean liteFlowForExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowForExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_LFOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_FOR_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_LFOR, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowForExpress_2(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, LITEFLOW_PAREN_RIGHT, LITEFLOW_DOT)) && r;
    r = p && report_error_(b, liteFlowDoExpress(b, l + 1)) && r;
    r = p && liteFlowForExpress_6(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // number | liteFlowNodeRefExpress
  private static boolean liteFlowForExpress_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowForExpress_2")) return false;
    boolean r;
    r = consumeToken(b, LITEFLOW_NUMBER);
    if (!r) r = liteFlowNodeRefExpress(b, l + 1);
    return r;
  }

  // [liteFlowForSubExpress]
  private static boolean liteFlowForExpress_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowForExpress_6")) return false;
    liteFlowForSubExpress(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DOT (liteFlowBreakExpress)
  public static boolean liteFlowForSubExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowForSubExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_FOR_SUB_EXPRESS, null);
    r = consumeToken(b, LITEFLOW_DOT);
    p = r; // pin = 1
    r = r && liteFlowForSubExpress_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (liteFlowBreakExpress)
  private static boolean liteFlowForSubExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowForSubExpress_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = liteFlowBreakExpress(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id PAREN_LEFT string PAREN_RIGHT
  public static boolean liteFlowIdExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIdExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_ID_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_ID, LITEFLOW_PAREN_LEFT, LITEFLOW_STRING, LITEFLOW_PAREN_RIGHT);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LELIF PAREN_LEFT liteFlowNodeRefExpress COMMA liteFlowAllExpress PAREN_RIGHT [liteFlowIf2ElifSubExpress]
  public static boolean liteFlowIf2ElifExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf2ElifExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_LELIF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_IF_2_ELIF_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_LELIF, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowNodeRefExpress(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LITEFLOW_COMMA)) && r;
    r = p && report_error_(b, liteFlowAllExpress(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, LITEFLOW_PAREN_RIGHT)) && r;
    r = p && liteFlowIf2ElifExpress_6(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [liteFlowIf2ElifSubExpress]
  private static boolean liteFlowIf2ElifExpress_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf2ElifExpress_6")) return false;
    liteFlowIf2ElifSubExpress(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DOT ( liteFlowIf2ElifExpress | liteFlowIf2ElseExpress | liteFlowIdExpress )
  public static boolean liteFlowIf2ElifSubExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf2ElifSubExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_IF_2_ELIF_SUB_EXPRESS, null);
    r = consumeToken(b, LITEFLOW_DOT);
    p = r; // pin = 1
    r = r && liteFlowIf2ElifSubExpress_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // liteFlowIf2ElifExpress | liteFlowIf2ElseExpress | liteFlowIdExpress
  private static boolean liteFlowIf2ElifSubExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf2ElifSubExpress_1")) return false;
    boolean r;
    r = liteFlowIf2ElifExpress(b, l + 1);
    if (!r) r = liteFlowIf2ElseExpress(b, l + 1);
    if (!r) r = liteFlowIdExpress(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LELSE PAREN_LEFT liteFlowAllExpress PAREN_RIGHT [liteFlowIf2ElseSubExpress]
  public static boolean liteFlowIf2ElseExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf2ElseExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_LELSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_IF_2_ELSE_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_LELSE, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowAllExpress(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LITEFLOW_PAREN_RIGHT)) && r;
    r = p && liteFlowIf2ElseExpress_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [liteFlowIf2ElseSubExpress]
  private static boolean liteFlowIf2ElseExpress_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf2ElseExpress_4")) return false;
    liteFlowIf2ElseSubExpress(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DOT (liteFlowIdExpress)
  public static boolean liteFlowIf2ElseSubExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf2ElseSubExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_IF_2_ELSE_SUB_EXPRESS, null);
    r = consumeToken(b, LITEFLOW_DOT);
    p = r; // pin = 1
    r = r && liteFlowIf2ElseSubExpress_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (liteFlowIdExpress)
  private static boolean liteFlowIf2ElseSubExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf2ElseSubExpress_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = liteFlowIdExpress(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LIF PAREN_LEFT liteFlowNodeRefExpress COMMA liteFlowAllExpress PAREN_RIGHT [liteFlowIf2SubExpress]
  public static boolean liteFlowIf2Express(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf2Express")) return false;
    if (!nextTokenIs(b, LITEFLOW_LIF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LITEFLOW_LIF, LITEFLOW_PAREN_LEFT);
    r = r && liteFlowNodeRefExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_COMMA);
    r = r && liteFlowAllExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_PAREN_RIGHT);
    r = r && liteFlowIf2Express_6(b, l + 1);
    exit_section_(b, m, LITEFLOW_LITE_FLOW_IF_2_EXPRESS, r);
    return r;
  }

  // [liteFlowIf2SubExpress]
  private static boolean liteFlowIf2Express_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf2Express_6")) return false;
    liteFlowIf2SubExpress(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DOT ( liteFlowIf2ElifExpress | liteFlowIf2ElseExpress | liteFlowIdExpress )
  public static boolean liteFlowIf2SubExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf2SubExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_IF_2_SUB_EXPRESS, null);
    r = consumeToken(b, LITEFLOW_DOT);
    p = r; // pin = 1
    r = r && liteFlowIf2SubExpress_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // liteFlowIf2ElifExpress | liteFlowIf2ElseExpress | liteFlowIdExpress
  private static boolean liteFlowIf2SubExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf2SubExpress_1")) return false;
    boolean r;
    r = liteFlowIf2ElifExpress(b, l + 1);
    if (!r) r = liteFlowIf2ElseExpress(b, l + 1);
    if (!r) r = liteFlowIdExpress(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LIF PAREN_LEFT liteFlowNodeRefExpress COMMA liteFlowAllExpress COMMA liteFlowAllExpress PAREN_RIGHT [liteFlowIf3SubExpress]
  public static boolean liteFlowIf3Express(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf3Express")) return false;
    if (!nextTokenIs(b, LITEFLOW_LIF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_IF_3_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_LIF, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowNodeRefExpress(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LITEFLOW_COMMA)) && r;
    r = p && report_error_(b, liteFlowAllExpress(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, LITEFLOW_COMMA)) && r;
    r = p && report_error_(b, liteFlowAllExpress(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, LITEFLOW_PAREN_RIGHT)) && r;
    r = p && liteFlowIf3Express_8(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [liteFlowIf3SubExpress]
  private static boolean liteFlowIf3Express_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf3Express_8")) return false;
    liteFlowIf3SubExpress(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DOT liteFlowIdExpress
  public static boolean liteFlowIf3SubExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIf3SubExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_IF_3_SUB_EXPRESS, null);
    r = consumeToken(b, LITEFLOW_DOT);
    p = r; // pin = 1
    r = r && liteFlowIdExpress(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ignoreError PAREN_LEFT boolean PAREN_RIGHT
  public static boolean liteFlowIgnoreErrorExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIgnoreErrorExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_IGNOREERROR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_IGNORE_ERROR_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_IGNOREERROR, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, boolean_$(b, l + 1));
    r = p && consumeToken(b, LITEFLOW_PAREN_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LITERATOR PAREN_LEFT (liteFlowNodeRefExpress) PAREN_RIGHT DOT liteFlowDoExpress [liteFlowIteratorSubExpress]
  public static boolean liteFlowIteratorExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIteratorExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_LITERATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_ITERATOR_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_LITERATOR, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowIteratorExpress_2(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, LITEFLOW_PAREN_RIGHT, LITEFLOW_DOT)) && r;
    r = p && report_error_(b, liteFlowDoExpress(b, l + 1)) && r;
    r = p && liteFlowIteratorExpress_6(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (liteFlowNodeRefExpress)
  private static boolean liteFlowIteratorExpress_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIteratorExpress_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = liteFlowNodeRefExpress(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [liteFlowIteratorSubExpress]
  private static boolean liteFlowIteratorExpress_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIteratorExpress_6")) return false;
    liteFlowIteratorSubExpress(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DOT (liteFlowBreakExpress)
  public static boolean liteFlowIteratorSubExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIteratorSubExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_ITERATOR_SUB_EXPRESS, null);
    r = consumeToken(b, LITEFLOW_DOT);
    p = r; // pin = 1
    r = r && liteFlowIteratorSubExpress_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (liteFlowBreakExpress)
  private static boolean liteFlowIteratorSubExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowIteratorSubExpress_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = liteFlowBreakExpress(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean liteFlowNodeRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeRef")) return false;
    if (!nextTokenIs(b, LITEFLOW_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_IDENTIFIER);
    exit_section_(b, m, LITEFLOW_LITE_FLOW_NODE_REF, r);
    return r;
  }

  /* ********************************************************** */
  // {block_comment | line_comment}* (liteFlowNodeRefSubExpress | liteFlowNodeStringSubExpress) {block_comment | line_comment}*
  public static boolean liteFlowNodeRefExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeRefExpress")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_NODE_REF_EXPRESS, "<lite flow node ref express>");
    r = liteFlowNodeRefExpress_0(b, l + 1);
    r = r && liteFlowNodeRefExpress_1(b, l + 1);
    r = r && liteFlowNodeRefExpress_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {block_comment | line_comment}*
  private static boolean liteFlowNodeRefExpress_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeRefExpress_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!liteFlowNodeRefExpress_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "liteFlowNodeRefExpress_0", c)) break;
    }
    return true;
  }

  // block_comment | line_comment
  private static boolean liteFlowNodeRefExpress_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeRefExpress_0_0")) return false;
    boolean r;
    r = consumeToken(b, LITEFLOW_BLOCK_COMMENT);
    if (!r) r = consumeToken(b, LITEFLOW_LINE_COMMENT);
    return r;
  }

  // liteFlowNodeRefSubExpress | liteFlowNodeStringSubExpress
  private static boolean liteFlowNodeRefExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeRefExpress_1")) return false;
    boolean r;
    r = liteFlowNodeRefSubExpress(b, l + 1);
    if (!r) r = liteFlowNodeStringSubExpress(b, l + 1);
    return r;
  }

  // {block_comment | line_comment}*
  private static boolean liteFlowNodeRefExpress_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeRefExpress_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!liteFlowNodeRefExpress_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "liteFlowNodeRefExpress_2", c)) break;
    }
    return true;
  }

  // block_comment | line_comment
  private static boolean liteFlowNodeRefExpress_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeRefExpress_2_0")) return false;
    boolean r;
    r = consumeToken(b, LITEFLOW_BLOCK_COMMENT);
    if (!r) r = consumeToken(b, LITEFLOW_LINE_COMMENT);
    return r;
  }

  /* ********************************************************** */
  // liteFlowNodeRef {DOT (liteFlowTagExpress | liteFlowDataExpress)}*
  public static boolean liteFlowNodeRefSubExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeRefSubExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = liteFlowNodeRef(b, l + 1);
    r = r && liteFlowNodeRefSubExpress_1(b, l + 1);
    exit_section_(b, m, LITEFLOW_LITE_FLOW_NODE_REF_SUB_EXPRESS, r);
    return r;
  }

  // {DOT (liteFlowTagExpress | liteFlowDataExpress)}*
  private static boolean liteFlowNodeRefSubExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeRefSubExpress_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!liteFlowNodeRefSubExpress_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "liteFlowNodeRefSubExpress_1", c)) break;
    }
    return true;
  }

  // DOT (liteFlowTagExpress | liteFlowDataExpress)
  private static boolean liteFlowNodeRefSubExpress_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeRefSubExpress_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_DOT);
    r = r && liteFlowNodeRefSubExpress_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // liteFlowTagExpress | liteFlowDataExpress
  private static boolean liteFlowNodeRefSubExpress_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeRefSubExpress_1_0_1")) return false;
    boolean r;
    r = liteFlowTagExpress(b, l + 1);
    if (!r) r = liteFlowDataExpress(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // string
  public static boolean liteFlowNodeStringRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeStringRef")) return false;
    if (!nextTokenIs(b, LITEFLOW_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_STRING);
    exit_section_(b, m, LITEFLOW_LITE_FLOW_NODE_STRING_REF, r);
    return r;
  }

  /* ********************************************************** */
  // (node | UNODE) PAREN_LEFT liteFlowNodeStringRef PAREN_RIGHT {DOT (liteFlowTagExpress | liteFlowDataExpress)}*
  public static boolean liteFlowNodeStringSubExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeStringSubExpress")) return false;
    if (!nextTokenIs(b, "<lite flow node string sub express>", LITEFLOW_NODE, LITEFLOW_UNODE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_NODE_STRING_SUB_EXPRESS, "<lite flow node string sub express>");
    r = liteFlowNodeStringSubExpress_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, LITEFLOW_PAREN_LEFT));
    r = p && report_error_(b, liteFlowNodeStringRef(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, LITEFLOW_PAREN_RIGHT)) && r;
    r = p && liteFlowNodeStringSubExpress_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // node | UNODE
  private static boolean liteFlowNodeStringSubExpress_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeStringSubExpress_0")) return false;
    boolean r;
    r = consumeToken(b, LITEFLOW_NODE);
    if (!r) r = consumeToken(b, LITEFLOW_UNODE);
    return r;
  }

  // {DOT (liteFlowTagExpress | liteFlowDataExpress)}*
  private static boolean liteFlowNodeStringSubExpress_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeStringSubExpress_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!liteFlowNodeStringSubExpress_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "liteFlowNodeStringSubExpress_4", c)) break;
    }
    return true;
  }

  // DOT (liteFlowTagExpress | liteFlowDataExpress)
  private static boolean liteFlowNodeStringSubExpress_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeStringSubExpress_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_DOT);
    r = r && liteFlowNodeStringSubExpress_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // liteFlowTagExpress | liteFlowDataExpress
  private static boolean liteFlowNodeStringSubExpress_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowNodeStringSubExpress_4_0_1")) return false;
    boolean r;
    r = liteFlowTagExpress(b, l + 1);
    if (!r) r = liteFlowDataExpress(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // PRE PAREN_LEFT liteFlowAllExpress {COMMA liteFlowAllExpress}* PAREN_RIGHT
  public static boolean liteFlowPreExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowPreExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_PRE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_PRE_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_PRE, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowAllExpress(b, l + 1));
    r = p && report_error_(b, liteFlowPreExpress_3(b, l + 1)) && r;
    r = p && consumeToken(b, LITEFLOW_PAREN_RIGHT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // {COMMA liteFlowAllExpress}*
  private static boolean liteFlowPreExpress_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowPreExpress_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!liteFlowPreExpress_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "liteFlowPreExpress_3", c)) break;
    }
    return true;
  }

  // COMMA liteFlowAllExpress
  private static boolean liteFlowPreExpress_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowPreExpress_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_COMMA);
    r = r && liteFlowAllExpress(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // liteFlowConditionExpress SEMICOLON
  public static boolean liteFlowStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowStatement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_STATEMENT, "<lite flow statement>");
    r = liteFlowConditionExpress(b, l + 1);
    p = r; // pin = 1
    r = r && consumeToken(b, LITEFLOW_SEMICOLON);
    exit_section_(b, l, m, r, p, LiteFlowParser::recover_liteFlowStatement);
    return r || p;
  }

  /* ********************************************************** */
  // SWITCH PAREN_LEFT liteFlowNodeRefExpress PAREN_RIGHT DOT (liteFlowToExpress | liteFlowDefaultExpress) [ liteFlowSwitchSubExpress ]
  public static boolean liteFlowSwitchExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowSwitchExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_SWITCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_SWITCH_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_SWITCH, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowNodeRefExpress(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, LITEFLOW_PAREN_RIGHT, LITEFLOW_DOT)) && r;
    r = p && report_error_(b, liteFlowSwitchExpress_5(b, l + 1)) && r;
    r = p && liteFlowSwitchExpress_6(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // liteFlowToExpress | liteFlowDefaultExpress
  private static boolean liteFlowSwitchExpress_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowSwitchExpress_5")) return false;
    boolean r;
    r = liteFlowToExpress(b, l + 1);
    if (!r) r = liteFlowDefaultExpress(b, l + 1);
    return r;
  }

  // [ liteFlowSwitchSubExpress ]
  private static boolean liteFlowSwitchExpress_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowSwitchExpress_6")) return false;
    liteFlowSwitchSubExpress(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DOT liteFlowIdExpress
  public static boolean liteFlowSwitchSubExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowSwitchSubExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_SWITCH_SUB_EXPRESS, null);
    r = consumeToken(b, LITEFLOW_DOT);
    p = r; // pin = 1
    r = r && liteFlowIdExpress(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // tag PAREN_LEFT string PAREN_RIGHT
  public static boolean liteFlowTagExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowTagExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_TAG)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_TAG_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_TAG, LITEFLOW_PAREN_LEFT, LITEFLOW_STRING, LITEFLOW_PAREN_RIGHT);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // THEN PAREN_LEFT liteFlowAllExpress {COMMA liteFlowAllExpress}* PAREN_RIGHT [liteFlowThenSubExpress]
  public static boolean liteFlowThenExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowThenExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_THEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_THEN_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_THEN, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowAllExpress(b, l + 1));
    r = p && report_error_(b, liteFlowThenExpress_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, LITEFLOW_PAREN_RIGHT)) && r;
    r = p && liteFlowThenExpress_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // {COMMA liteFlowAllExpress}*
  private static boolean liteFlowThenExpress_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowThenExpress_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!liteFlowThenExpress_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "liteFlowThenExpress_3", c)) break;
    }
    return true;
  }

  // COMMA liteFlowAllExpress
  private static boolean liteFlowThenExpress_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowThenExpress_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_COMMA);
    r = r && liteFlowAllExpress(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [liteFlowThenSubExpress]
  private static boolean liteFlowThenExpress_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowThenExpress_5")) return false;
    liteFlowThenSubExpress(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DOT liteFlowIdExpress
  public static boolean liteFlowThenSubExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowThenSubExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_THEN_SUB_EXPRESS, null);
    r = consumeToken(b, LITEFLOW_DOT);
    p = r; // pin = 1
    r = r && liteFlowIdExpress(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // threadPool PAREN_LEFT string PAREN_RIGHT
  public static boolean liteFlowThreadPoolExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowThreadPoolExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_THREADPOOL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_THREAD_POOL_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_THREADPOOL, LITEFLOW_PAREN_LEFT, LITEFLOW_STRING, LITEFLOW_PAREN_RIGHT);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (to | UTO) PAREN_LEFT liteFlowAllExpress {COMMA liteFlowAllExpress}* PAREN_RIGHT [DOT liteFlowDefaultExpress]
  public static boolean liteFlowToExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowToExpress")) return false;
    if (!nextTokenIs(b, "<lite flow to express>", LITEFLOW_TO, LITEFLOW_UTO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_TO_EXPRESS, "<lite flow to express>");
    r = liteFlowToExpress_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, LITEFLOW_PAREN_LEFT));
    r = p && report_error_(b, liteFlowAllExpress(b, l + 1)) && r;
    r = p && report_error_(b, liteFlowToExpress_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, LITEFLOW_PAREN_RIGHT)) && r;
    r = p && liteFlowToExpress_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // to | UTO
  private static boolean liteFlowToExpress_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowToExpress_0")) return false;
    boolean r;
    r = consumeToken(b, LITEFLOW_TO);
    if (!r) r = consumeToken(b, LITEFLOW_UTO);
    return r;
  }

  // {COMMA liteFlowAllExpress}*
  private static boolean liteFlowToExpress_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowToExpress_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!liteFlowToExpress_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "liteFlowToExpress_3", c)) break;
    }
    return true;
  }

  // COMMA liteFlowAllExpress
  private static boolean liteFlowToExpress_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowToExpress_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_COMMA);
    r = r && liteFlowAllExpress(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [DOT liteFlowDefaultExpress]
  private static boolean liteFlowToExpress_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowToExpress_5")) return false;
    liteFlowToExpress_5_0(b, l + 1);
    return true;
  }

  // DOT liteFlowDefaultExpress
  private static boolean liteFlowToExpress_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowToExpress_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_DOT);
    r = r && liteFlowDefaultExpress(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WHEN PAREN_LEFT liteFlowAllExpress {COMMA liteFlowAllExpress}* PAREN_RIGHT { liteFlowWhenSubExpress }*
  public static boolean liteFlowWhenExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowWhenExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_WHEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_WHEN_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_WHEN, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowAllExpress(b, l + 1));
    r = p && report_error_(b, liteFlowWhenExpress_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, LITEFLOW_PAREN_RIGHT)) && r;
    r = p && liteFlowWhenExpress_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // {COMMA liteFlowAllExpress}*
  private static boolean liteFlowWhenExpress_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowWhenExpress_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!liteFlowWhenExpress_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "liteFlowWhenExpress_3", c)) break;
    }
    return true;
  }

  // COMMA liteFlowAllExpress
  private static boolean liteFlowWhenExpress_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowWhenExpress_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_COMMA);
    r = r && liteFlowAllExpress(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { liteFlowWhenSubExpress }*
  private static boolean liteFlowWhenExpress_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowWhenExpress_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!liteFlowWhenExpress_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "liteFlowWhenExpress_5", c)) break;
    }
    return true;
  }

  // { liteFlowWhenSubExpress }
  private static boolean liteFlowWhenExpress_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowWhenExpress_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = liteFlowWhenSubExpress(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOT (liteFlowIdExpress | liteFlowIgnoreErrorExpress | liteFlowAnyExpress | liteFlowThreadPoolExpress)
  public static boolean liteFlowWhenSubExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowWhenSubExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_WHEN_SUB_EXPRESS, null);
    r = consumeToken(b, LITEFLOW_DOT);
    p = r; // pin = 1
    r = r && liteFlowWhenSubExpress_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // liteFlowIdExpress | liteFlowIgnoreErrorExpress | liteFlowAnyExpress | liteFlowThreadPoolExpress
  private static boolean liteFlowWhenSubExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowWhenSubExpress_1")) return false;
    boolean r;
    r = liteFlowIdExpress(b, l + 1);
    if (!r) r = liteFlowIgnoreErrorExpress(b, l + 1);
    if (!r) r = liteFlowAnyExpress(b, l + 1);
    if (!r) r = liteFlowThreadPoolExpress(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LWHILE PAREN_LEFT liteFlowNodeRefExpress PAREN_RIGHT DOT liteFlowDoExpress [liteFlowWhileSubExpress]
  public static boolean liteFlowWhileExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowWhileExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_LWHILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_WHILE_EXPRESS, null);
    r = consumeTokens(b, 1, LITEFLOW_LWHILE, LITEFLOW_PAREN_LEFT);
    p = r; // pin = 1
    r = r && report_error_(b, liteFlowNodeRefExpress(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, LITEFLOW_PAREN_RIGHT, LITEFLOW_DOT)) && r;
    r = p && report_error_(b, liteFlowDoExpress(b, l + 1)) && r;
    r = p && liteFlowWhileExpress_6(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [liteFlowWhileSubExpress]
  private static boolean liteFlowWhileExpress_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowWhileExpress_6")) return false;
    liteFlowWhileSubExpress(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DOT (liteFlowBreakExpress)
  public static boolean liteFlowWhileSubExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowWhileSubExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_DOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_LITE_FLOW_WHILE_SUB_EXPRESS, null);
    r = consumeToken(b, LITEFLOW_DOT);
    p = r; // pin = 1
    r = r && liteFlowWhileSubExpress_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (liteFlowBreakExpress)
  private static boolean liteFlowWhileSubExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "liteFlowWhileSubExpress_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = liteFlowBreakExpress(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // new fnInvokeExpress
  public static boolean newExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_NEW);
    r = r && fnInvokeExpress(b, l + 1);
    exit_section_(b, m, LITEFLOW_NEW_EXPRESS, r);
    return r;
  }

  /* ********************************************************** */
  // newExpress SEMICOLON
  public static boolean newStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newStatement")) return false;
    if (!nextTokenIs(b, LITEFLOW_NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = newExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_SEMICOLON);
    exit_section_(b, m, LITEFLOW_NEW_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // PLUS                 // +
  //     | MINUS                // -
  //     | MUL                  // *
  //     | QUOTIENT             // /
  //     | REMAINDER            // %
  //     | LESS                 // <
  //     | LESS_OR_EQUAL        // <=
  //     | GREATER              // >
  //     | GREATER_OR_EQUAL     // >=
  //     | EQ                   // ==
  //     | NOT_EQ               // !=
  //     | BIT_AND              // &
  //     | BIT_OR               // |
  //     | BIT_XOR              // ^
  //     | NOT                  // !
  //     | COND_OR              // ||
  //     | COND_AND             // &&
  //     | mod                  // MOD
  //     | nor
  public static boolean op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_OP, "<op>");
    r = consumeToken(b, LITEFLOW_PLUS);
    if (!r) r = consumeToken(b, LITEFLOW_MINUS);
    if (!r) r = consumeToken(b, LITEFLOW_MUL);
    if (!r) r = consumeToken(b, LITEFLOW_QUOTIENT);
    if (!r) r = consumeToken(b, LITEFLOW_REMAINDER);
    if (!r) r = consumeToken(b, LITEFLOW_LESS);
    if (!r) r = consumeToken(b, LITEFLOW_LESS_OR_EQUAL);
    if (!r) r = consumeToken(b, LITEFLOW_GREATER);
    if (!r) r = consumeToken(b, LITEFLOW_GREATER_OR_EQUAL);
    if (!r) r = consumeToken(b, LITEFLOW_EQ);
    if (!r) r = consumeToken(b, LITEFLOW_NOT_EQ);
    if (!r) r = consumeToken(b, LITEFLOW_BIT_AND);
    if (!r) r = consumeToken(b, LITEFLOW_BIT_OR);
    if (!r) r = consumeToken(b, LITEFLOW_BIT_XOR);
    if (!r) r = consumeToken(b, LITEFLOW_NOT);
    if (!r) r = consumeToken(b, LITEFLOW_COND_OR);
    if (!r) r = consumeToken(b, LITEFLOW_COND_AND);
    if (!r) r = consumeToken(b, LITEFLOW_MOD);
    if (!r) r = consumeToken(b, LITEFLOW_NOR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [NOT] ( (fnInvokeExpress|refExpress|value)| PAREN_LEFT (fnInvokeExpress|refExpress|value) PAREN_RIGHT) {op (allExpress|PAREN_LEFT allExpress PAREN_RIGHT)}*
  public static boolean opExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opExpress")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_OP_EXPRESS, "<op express>");
    r = opExpress_0(b, l + 1);
    r = r && opExpress_1(b, l + 1);
    r = r && opExpress_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [NOT]
  private static boolean opExpress_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opExpress_0")) return false;
    consumeToken(b, LITEFLOW_NOT);
    return true;
  }

  // (fnInvokeExpress|refExpress|value)| PAREN_LEFT (fnInvokeExpress|refExpress|value) PAREN_RIGHT
  private static boolean opExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opExpress_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opExpress_1_0(b, l + 1);
    if (!r) r = opExpress_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // fnInvokeExpress|refExpress|value
  private static boolean opExpress_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opExpress_1_0")) return false;
    boolean r;
    r = fnInvokeExpress(b, l + 1);
    if (!r) r = refExpress(b, l + 1);
    if (!r) r = value(b, l + 1);
    return r;
  }

  // PAREN_LEFT (fnInvokeExpress|refExpress|value) PAREN_RIGHT
  private static boolean opExpress_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opExpress_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_PAREN_LEFT);
    r = r && opExpress_1_1_1(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_PAREN_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // fnInvokeExpress|refExpress|value
  private static boolean opExpress_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opExpress_1_1_1")) return false;
    boolean r;
    r = fnInvokeExpress(b, l + 1);
    if (!r) r = refExpress(b, l + 1);
    if (!r) r = value(b, l + 1);
    return r;
  }

  // {op (allExpress|PAREN_LEFT allExpress PAREN_RIGHT)}*
  private static boolean opExpress_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opExpress_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!opExpress_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "opExpress_2", c)) break;
    }
    return true;
  }

  // op (allExpress|PAREN_LEFT allExpress PAREN_RIGHT)
  private static boolean opExpress_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opExpress_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op(b, l + 1);
    r = r && opExpress_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // allExpress|PAREN_LEFT allExpress PAREN_RIGHT
  private static boolean opExpress_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opExpress_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = allExpress(b, l + 1);
    if (!r) r = opExpress_2_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PAREN_LEFT allExpress PAREN_RIGHT
  private static boolean opExpress_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opExpress_2_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_PAREN_LEFT);
    r = r && allExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_PAREN_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // refExpress (PLUS_PLUS | MINUS_MINUS)
  public static boolean opSelfExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opSelfExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = refExpress(b, l + 1);
    r = r && opSelfExpress_1(b, l + 1);
    exit_section_(b, m, LITEFLOW_OP_SELF_EXPRESS, r);
    return r;
  }

  // PLUS_PLUS | MINUS_MINUS
  private static boolean opSelfExpress_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opSelfExpress_1")) return false;
    boolean r;
    r = consumeToken(b, LITEFLOW_PLUS_PLUS);
    if (!r) r = consumeToken(b, LITEFLOW_MINUS_MINUS);
    return r;
  }

  /* ********************************************************** */
  // opSelfExpress SEMICOLON
  public static boolean opSelfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opSelfStatement")) return false;
    if (!nextTokenIs(b, LITEFLOW_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opSelfExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_SEMICOLON);
    exit_section_(b, m, LITEFLOW_OP_SELF_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // !(SEMICOLON | liteFlowStatement | assignStatement | line_comment | block_comment | fnInvokeStatement)
  static boolean recover_liteFlowStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_liteFlowStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recover_liteFlowStatement_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SEMICOLON | liteFlowStatement | assignStatement | line_comment | block_comment | fnInvokeStatement
  private static boolean recover_liteFlowStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_liteFlowStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_SEMICOLON);
    if (!r) r = liteFlowStatement(b, l + 1);
    if (!r) r = assignStatement(b, l + 1);
    if (!r) r = consumeToken(b, LITEFLOW_LINE_COMMENT);
    if (!r) r = consumeToken(b, LITEFLOW_BLOCK_COMMENT);
    if (!r) r = fnInvokeStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // typeRef
  public static boolean refExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "refExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeRef(b, l + 1);
    exit_section_(b, m, LITEFLOW_REF_EXPRESS, r);
    return r;
  }

  /* ********************************************************** */
  // return allExpress* SEMICOLON
  public static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    if (!nextTokenIs(b, LITEFLOW_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_RETURN);
    r = r && returnStatement_1(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_SEMICOLON);
    exit_section_(b, m, LITEFLOW_RETURN_STATEMENT, r);
    return r;
  }

  // allExpress*
  private static boolean returnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!allExpress(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "returnStatement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // line_comment |
  //     block_comment |
  //     ifStatement |
  //     forStatement |
  //     whileStatement |
  //     assignStatement |
  //     breakStatement |
  //     continueStatement |
  //     threeStatement |
  //     fnInvokeStatement |
  //     newStatement |
  //     returnStatement |
  //     opSelfStatement |
  //     liteFlowStatement |
  //     BRACE_LEFT statement* BRACE_RIGHT
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_STATEMENT, "<statement>");
    r = consumeToken(b, LITEFLOW_LINE_COMMENT);
    if (!r) r = consumeToken(b, LITEFLOW_BLOCK_COMMENT);
    if (!r) r = ifStatement(b, l + 1);
    if (!r) r = forStatement(b, l + 1);
    if (!r) r = whileStatement(b, l + 1);
    if (!r) r = assignStatement(b, l + 1);
    if (!r) r = breakStatement(b, l + 1);
    if (!r) r = continueStatement(b, l + 1);
    if (!r) r = threeStatement(b, l + 1);
    if (!r) r = fnInvokeStatement(b, l + 1);
    if (!r) r = newStatement(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
    if (!r) r = opSelfStatement(b, l + 1);
    if (!r) r = liteFlowStatement(b, l + 1);
    if (!r) r = statement_14(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BRACE_LEFT statement* BRACE_RIGHT
  private static boolean statement_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_BRACE_LEFT);
    r = r && statement_14_1(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_BRACE_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement*
  private static boolean statement_14_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_14_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_14_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // opSelfExpress | useArrayExpress | arrayExpress | threeExpress | newExpress | liteFlowConditionExpress | fnInvokeExpress {op allExpress}* | express | PAREN_LEFT assignExpress PAREN_RIGHT
  public static boolean subAllExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subAllExpress")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_SUB_ALL_EXPRESS, "<sub all express>");
    r = opSelfExpress(b, l + 1);
    if (!r) r = useArrayExpress(b, l + 1);
    if (!r) r = arrayExpress(b, l + 1);
    if (!r) r = threeExpress(b, l + 1);
    if (!r) r = newExpress(b, l + 1);
    if (!r) r = liteFlowConditionExpress(b, l + 1);
    if (!r) r = subAllExpress_6(b, l + 1);
    if (!r) r = express(b, l + 1);
    if (!r) r = subAllExpress_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // fnInvokeExpress {op allExpress}*
  private static boolean subAllExpress_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subAllExpress_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fnInvokeExpress(b, l + 1);
    r = r && subAllExpress_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {op allExpress}*
  private static boolean subAllExpress_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subAllExpress_6_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!subAllExpress_6_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "subAllExpress_6_1", c)) break;
    }
    return true;
  }

  // op allExpress
  private static boolean subAllExpress_6_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subAllExpress_6_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op(b, l + 1);
    r = r && allExpress(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PAREN_LEFT assignExpress PAREN_RIGHT
  private static boolean subAllExpress_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subAllExpress_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_PAREN_LEFT);
    r = r && assignExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_PAREN_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (fnInvokeExpress | express) QUESTION allExpress COLON allExpress
  public static boolean threeExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "threeExpress")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_THREE_EXPRESS, "<three express>");
    r = threeExpress_0(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_QUESTION);
    r = r && allExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_COLON);
    r = r && allExpress(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // fnInvokeExpress | express
  private static boolean threeExpress_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "threeExpress_0")) return false;
    boolean r;
    r = fnInvokeExpress(b, l + 1);
    if (!r) r = express(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // threeExpress SEMICOLON
  public static boolean threeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "threeStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_THREE_STATEMENT, "<three statement>");
    r = threeExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier {DOT identifier}*
  public static boolean typeRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeRef")) return false;
    if (!nextTokenIs(b, LITEFLOW_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITEFLOW_IDENTIFIER);
    r = r && typeRef_1(b, l + 1);
    exit_section_(b, m, LITEFLOW_TYPE_REF, r);
    return r;
  }

  // {DOT identifier}*
  private static boolean typeRef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeRef_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typeRef_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeRef_1", c)) break;
    }
    return true;
  }

  // DOT identifier
  private static boolean typeRef_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeRef_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LITEFLOW_DOT, LITEFLOW_IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // refExpress BRACK_LEFT allExpress BRACK_RIGHT
  public static boolean useArrayExpress(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArrayExpress")) return false;
    if (!nextTokenIs(b, LITEFLOW_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = refExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_BRACK_LEFT);
    r = r && allExpress(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_BRACK_RIGHT);
    exit_section_(b, m, LITEFLOW_USE_ARRAY_EXPRESS, r);
    return r;
  }

  /* ********************************************************** */
  // string|number|boolean|null
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITEFLOW_VALUE, "<value>");
    r = consumeToken(b, LITEFLOW_STRING);
    if (!r) r = consumeToken(b, LITEFLOW_NUMBER);
    if (!r) r = boolean_$(b, l + 1);
    if (!r) r = consumeToken(b, LITEFLOW_NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // while PAREN_LEFT allExpress PAREN_RIGHT BRACE_LEFT codes BRACE_RIGHT
  public static boolean whileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement")) return false;
    if (!nextTokenIs(b, LITEFLOW_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LITEFLOW_WHILE, LITEFLOW_PAREN_LEFT);
    r = r && allExpress(b, l + 1);
    r = r && consumeTokens(b, 0, LITEFLOW_PAREN_RIGHT, LITEFLOW_BRACE_LEFT);
    r = r && codes(b, l + 1);
    r = r && consumeToken(b, LITEFLOW_BRACE_RIGHT);
    exit_section_(b, m, LITEFLOW_WHILE_STATEMENT, r);
    return r;
  }

}
