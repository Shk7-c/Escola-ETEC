import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, ScrollView } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <ScrollView contentContainerStyle={styles.scrollContainer}>
        <Text style={styles.name}>Gustavo de Souza Serafim</Text>
        <Text style={styles.title}>Desenvolvedor / Programador</Text>

        <Text style={styles.sectionTitle}>Objetivo</Text>
        <Text style={styles.info}>
          Atuar como desenvolvedor de software, contribuindo com minhas habilidades técnicas e aprendendo continuamente para crescer na área de tecnologia.
        </Text>

        <Text style={styles.sectionTitle}>Informações Pessoais</Text>
        <Text style={styles.info}>Email: gustavo2342@gmail.com</Text>
        <Text style={styles.info}>Contato: (11) 94284-6108</Text>
        <Text style={styles.info}>Endereço: Rua Alegre, 432 - São Paulo</Text>
        <Text style={styles.info}>Data de Nascimento: 07/06/2007</Text>

        <Text style={styles.sectionTitle}>Formação Acadêmica</Text>
        <Text style={styles.info}>• Ensino Médio Técnico com habilitação em desenvolvimento de sistemas- Etec de Cidade Tiradentes (Cursando)</Text>

        <Text style={styles.sectionTitle}>Habilidades</Text>
        <Text style={styles.info}>• Lógica de programação</Text>
        <Text style={styles.info}>• HTML, CSS e JavaScript (básico)</Text>
        <Text style={styles.info}>• Estruturas de dados básicas (listas, arrays)</Text>
        <Text style={styles.info}>• Familiaridade com Visual Studio Code</Text>
        <Text style={styles.info}>• Trabalho em equipe e boa comunicação</Text>
      </ScrollView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#1e1e1e',
  },
  scrollContainer: {
    padding: 30,
    alignItems: 'center',
  },
  name: {
    fontSize: 26,
    fontWeight: 'bold',
    color: '#00FFAA',
    marginBottom: 10,
  },
  title: {
    fontSize: 18,
    fontStyle: 'italic',
    color: '#ccc',
    marginBottom: 30,
  },
  sectionTitle: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#fff',
    marginTop: 20,
    marginBottom: 10,
    alignSelf: 'flex-start',
  },
  info: {
    fontSize: 16,
    color: '#ddd',
    marginBottom: 8,
    alignSelf: 'flex-start',
  },
});
