
public class Missoes {
        private String nomeDaMissao;
        private String NinjaResponsavel;
        private NivelDeDificuldade dificuldade;

        public Missoes(String nomeDaMissao, String ninjaResponsavel) {
            this.nomeDaMissao = nomeDaMissao;
            NinjaResponsavel = ninjaResponsavel;
        }

        public Missoes(String nomeDaMissao, String ninjaResponsavel, NivelDeDificuldade dificuldade) {
            this(nomeDaMissao, ninjaResponsavel);
            this.dificuldade = dificuldade;
        }

        public String getNomeDaMissao() {
            return nomeDaMissao;
        }

        public void setNomeDaMissao(String nomeDaMissao) {
            this.nomeDaMissao = nomeDaMissao;
        }

        public String getNinjaResponsavel() {
            return NinjaResponsavel;
        }

        public void setNinjaResponsavel(String ninjaResponsavel) {
            NinjaResponsavel = ninjaResponsavel;
        }

        public NivelDeDificuldade getDificuldade() {
            return dificuldade;
        }

        public void setDificuldade(NivelDeDificuldade dificuldade) {
            this.dificuldade = dificuldade;
        }

        @Override
        public String toString() {
            return "Missoes{" +
                    "nomeDaMissao='" + nomeDaMissao + '\'' +
                    ", NinjaResponsavel='" + NinjaResponsavel + '\'' +
                    ", dificuldade=" + dificuldade +
                    '}';
        }
    }


